# Inter-Thread Communication

=> wait(), notify(), notifyAll() => Object Class ke Methods hai ye.

=> Producer-Consumer Problem

Producer Boxme value dalega and consumer us value ko consume karega.

=> Multithreading = Non-deterministic code
Problems
1. Consumer tries to consume Null Values.
2. Producer produce the value without the consumer consume the previos.




# Wait() 
=> Pause ho jati
=> Lock released
=> waiting state me chali jati hai.
=> koi aur thread notify() or notifyAll() method call karegi to runnble state me aa jayegi

1. Release monitor locks
2. It goes in waiting state.
3. It stays there, untill another thread wakes it up.

=> can be used only in synchronize block otherwise throwsan Exception called  IllegalMonitorStateException.



=> In Java every Object has a lock called Moniter Lock and has 
=> owner Thread
=> waitingQueue



# notify() :- 
waiting queue me koi bi thread ko wake up kar do.
and blocked state me bhej do and vapas me lock acquire karna padega and then runnable state me then running and jaha stop kiya tha vahi se start karegi execute karna.

=> must be come under synchronize block otherwise through Exception.

1. one random thread is picked from waiting queue.
2. That Thread --> Blocked State.
3. Compete for the Lock
4. Once lock occupied -> Running.


# notifyAll()

1. All threads in waiting queue are moved to Blocked State.
2. They all try to aquire the lock.
3. Only one gets the lock at a time.

=> It is more safer than notify() method but has overhead but okay to use.

=> how safe?

multiple producer and multiple consumer ho sakte hai.
=> if dono waiting me hai kon kise notify kare
=> notifyAll() safe hai use karna. 



=> Ye tino method Object Class ke hai. because lock Object ke hote hai so communication ke liye


=> sleep() => TIMED_WAITING State me

=> wait() => waiting state me

=> kabhi kabhi bina notify() ke thread Blocked state me aati hai ise kahte hai Spurious call.

=> Java Controll akela nahi karta hai OS + CPU karti hai control if koi thread bahut der se hai to OS kar sakta hai sporious wake up
=> isilye while use kiya if ki place par agar if kiya to if block dobara execute nahi hota lopp hota hai.





# Real Life Example

1. Document Creator (Producer) and Printer (Consumer) 
and it is a classic problem of multithreading and it's solution discuseed. 
