# Lock in Java
=> Lock is a interface in Java in concurrency package.
=> Jo bhi class implement karegi to use 2 method must implement karne padege
1. lock()
2. unlock()



# LImitation of Synchronized lock
1. No Control over lock.

synchronized void f() {

}
=> if t1 access karne ka try karti but pata lagta ki koi aur thread ne kar rakha to vo waiting state me chali jayegi.
=> But we want control that agar lock na access ho to kuchh aur kaam kar sake.

2. No time out.
3. No Fairness (Sabse Pahle aai hui but use resource na mile => Problem => Stravation).



# Lock Interface
1. lock()
2. unlock()


# Types of Lock

1. Reentrant Lock (mostly used)
2. ReadWriteLock
3. StampedLock
4. Semaphore

1. Reentrant Lock

  Lock lock = new ReentrantLock();
  lock.lock()
  // critical lock => try catch me likhege and finally me unlock karege nahi to exception aane par sari thread wait hi karti rahegi ie blocked state me 
  lock.unlock()

=> why this?

=> to prevent thread going to blocked state
if(lock.tryLock()){

}
else{ // agar lock na mila to 

}
=> isme dhayn rakhna unlock karna mat bhulna isilye finally me likhte hai.

=> same thread can acquire lock multiple time.

lock.lock();
lock.lock();
lock.lock();

// critical code section

lock.unlock();
lock.unlock();
lock.unlock();

=> benefit:- 
methodA() {
  lock.lock()

  try {
    methodB();
  }
  finally(
    lock.unlock();
  )
}

methodB() {
  lock.lock()

  try {
    
  }
  finally(
    lock.unlock();
  )
}

// ye karna possible hai isme 
=> ye synchronize me bhi kar sakte hai.

=> main thong in it are the methods 
tryLock() timeout() etc.

# Methods in Reentrant Lock

1. lock()
2. unlock(); => if not lock then IllegalStateException
3. tryLock();
tryLock(timout, timeUnit);
  if(tryLock()){

 }
 else{
  
 }

 if(tryLock(2, TimeUnit.SECONDS)){

 }
 else{

 }

4. isLocked() :- monitoring , debugging 
because it is not atomic

5. isHeldByCurrentThread();

if(isHeldByCurrentThread()){
  lock.unlock()
}

6. getHoldCount(); => how may times a thread holds a lock

=> ReentrantLock 
parentLock:-
count:- 

7. isFair()
if not starvation then fair otherwise not.

=> how to make reentrant lock fair?

=> always become unfair in starting
Reentrantlock l1 = new Reentrantlock();

Reentrantlock l2 = new Reentrantlock(true); => become fair
// approximate because OS CPU decides



# ReadWrieLock 
=> It is a interface and a class ReentrantReadWriteLock implemet it.

=> if hame only read karna hai to multiple thread can execute it.
Reading (Non-destructive)
=> problem aati hai writing me
writing (destructive)

=> Exclusive Lock
=> Shared Lock

=> it provides ttwo type locks
1. readlock()  => shared 
2. writeLock() => exclusive

ReadWriteLock lock = new ReentrantReadWriteLock()

=> multiple Readers allowed together.
=> one writer single allowed
=> 1W+1R => not allowed.

=> 
Lock rl = lock.readlock(); => gives sharedlock

Lock wl = lock.wrietLock(); => gives exclusive lock

# Reader-Writer Problem

=> A Resource is a file.
=> can read and write into it.
=> multiple reader and writer are there.
=> multiple readers are allowed together.
=> Single Writer allowed only.



=> Imagine multiple reader aate rahe and writer bahar wait hi karta rahe
=> lock down grading:- if write karke turant read karna hai to use read me downgrade kar denge 
=> iska opposite nahi kar sakte hai.

Ex:- writelock.lock();

try {
  value = 100
  readlock.lock()
}
finally {
  writelock.unlock()
}

=> pahla lock release karne se pahle dusra lock acquire kar lenge jisse dusra thread use acquire na kar paye.


# StampedLock 
=> modern version of readWriteLock

1. writelock();
2. readLock();
3. tryOptimisticRead()

=> stamp :- long stamp
 StampedLock lock = new StampedLock();

 long stamped = lock.readLOck(); or lock.writeLock();
 try{

 }
 finally {
  lock.unlockRead(stamp); // why passed stamp :- ek object ko ek thread de di
 }

 => main fayda iska tryOptimisticRead() me aata hai.

 => Java me two type ke locking techniques

 1. Pessimistic
 2. Optimistic

 1. Pessimistic:- lock -> critical section ->  unlock karte hai.
 => ye slow hai because of overhead.

 2. optimistic:- Not a lock litterally.
 => normally enter kar jaunga critical section me normally read karunga 
 and check karunga us time kisi ne chage to nahi kiya to normally return kar jaunga 
 and if change kar diya then pessimistic locking technique laga ke read karega.
 => ye use karta hai stamps ka.
 => Ex:- CAS, AtomicInteger.
 
 => tryOptimisticRead()
 1. Get a stamp.
 2. read data without locking
 3. checking if data is modified.

 => it is not reentrate ie ek hi baar baar lock nahi kar sata => deadlock aa jayega.



# Semaphore

=> permits = 3;

Semaphore s1 = new Semaphore(3);

s1.acquire(); (Take 1 permit)
s1.release(); (release 1 permit)


=> Two Types
1. Binary  Semaphore s1 = new Semaphore(1);
2. Counting 

Diffrence lck vs Semaphore

=> locks are ownership based.
=> semaphore => no ownership


Semaphore s1 = new Semaphore(3, true); :- fair pahle vali pahle chance

Use:- RateLimiter, Limit Parallel Tasks


# Condition Interface
=> a waiting area

wait()      ---->  await()
notify()    -----> signal()
notifyAll() -----> signalAll()

Lock l1 = new ReentrantLock();
Condition c1 = l1.newCondition();


c1.awaits(); // release lock
c1.signal(); // multiple waiting queues
c1.signalAll()



=> sporious wake up hone ke chance hote hai 
=> isse bachne ke liye logic 
while(value != null){
  
}
 le andar likhenge.

