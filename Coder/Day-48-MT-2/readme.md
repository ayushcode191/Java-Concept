# Thread Objects

1. Extending the Thread class
2. Implementing the Runnable interface

# Thread Life cycle




    New -> Threa t1 = new Thread(...);
     :
     : start()
     :           aquire lock/IO Task  
   Runnable--|    -----------------------> Blocked
     :       |    <----------------------
     :       |     lock released
     :       |
     :       |      wait()
     :       |    ----------> waiting
     : run() |    <----------
     :       |      notify()
     :       |
     :       |    sleep(...), join(..), wait(...)
     :       |    ---------------->   Timed_waiting
     :       |      
   Running --|
     :
     :
     :
   Terminated
    

// stop() -> kisi bhi state me ho terminated state me chale jayege. but it is not a good method


// Shared Resources
// Part of that section called -> Critical Section
// Lock karte hai is section ko


// Blocked and waiting -> lock release kar deti.
// Timed Waiting -> lock release nahi karti hai.