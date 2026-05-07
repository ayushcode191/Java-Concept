# Synchronized Keyword

synchronized  void increment(){
    count++; // 3 increment
} 


1. T1 acquire lock
2. T2 tries to lock --> block state
3. T1 will perform (entire operation)
4. As soon as T1 exit --> T2 can enter


=> why we need synchronized keyword
1. To protect shared Data.
2. To make any operation atmoic.
3. To ensure visibility.
4. To prevent re-ordering.



=> {
    synchronized => sirf yahi part synchronized hota hai.
}

ye method par only nahi lagta hai object par lag jata hai.


This use 
# Monitor Lock => (Object Lock)
=> only one can acquire at a time.


=> Every Java object has a lock (internal-lock) maintained by JVM.

// Agar t1 ne lock acquire kar liya and m1 me enter kar gaya  then t2 m2 ke liye bhi lock acquire nahi kar sakta jab tak t1 kiye hai because lock object par acquire hota hai

// => one object => one lock

// if same class ke two object hai to dono ke alag alag lock hoge 
// test1.m1() , test2.m2() => ek sath lock acquire kar sakte hai.

=> Synchronized block :- if we not want entire method synchronized.

synchronized (this) {

}


=> Custom lock object.




# How Lock internall works?

Object ---> lock : {
    ownerTHread: null,
    isLOcked: false,
    waitingQueue: []
}

synchronized(obj){
    // critical section
}


if(obj.lock.isLocked == false){
    obj.lock.locked = true
    obj.locked.ownerThread = t1
}
else{
    // someone is already inside
    obj.lock.waitingQueue(t2)
}

=> Ye bhi to Chec then Act vala scene hai
=> kya ho multiple Thread check kare nad andar enter ho jaye.

=> Ye operation by default atomic ensure hota hai 
=> and ye make sure karta hai "CAS".


=> synchronized baar use karna make process slow and it increase overhead.
=> so not recommended to use more in production.

