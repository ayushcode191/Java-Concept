# Executor Framework

=> Manual Creation of Thread is a not a good Approach.

=> Memory Allocation
512 KB - 1 MB space allocate hoti hai
=> 1000 thread banaye to bahut sari memory allocate ho jayegi

=> OS Scheduling.
=> ek core multiple thread handle karegi and context switch me jyada time lagega and work me nahi is= problem ko thrashing kahete hai.

=> Thread Creation Time => OS 
=> not so much use because one time use hota hai ye.

EX:- Rea Life example -> Chef se ek baar khana banvake use fire karna hai new new hire karna


So Introduce Executor Framework:-

In Normally wants Thread => two works

1. Task
2. How to do?

=> Executor Framework wants only
1. What is Task 
=> if thread banani hogi to bana lunga varna re-use kar lunga.

It Introduce Thread-Pool

# Thread-Pool
1. Simple Thread pool

Let's Take 5 Thread pahle se bani hui hai Pool me inhe worker Thread kahte hai.
aap mujhe bas Task do then use mai ek thread ko assign kar dunga and vo kaam karne chali jayengi.
then 2nd task 2nd thread ko assign karegi and then vo kaam kar dengi.
jab t1 kaam kar legi then terminate nahi hogi vapas thread pool meaa jayegi l, life cycle thread pool manage karta hai.


=> Java has Queue also. done mapping
Task1 -> Thread1
Task2 -> Thread2
Task3 -> Thread3
Task4 -> Thread4
Task5 -> Thread5
T1 Completed task and T1 return in pool and T2 also return.
Task6 -> Thread1 
Task7 -> Thread2
If a new Task come Task8 an no workers available in pool then if queue has space then insert task in queue and when workers return it checks in queue if any task then so on.

=> if no worker and no space in queue then Executer framework has two options
1. Create a new Worker Thread and assign a task from queue and insert Task8 in queue.
2. Discard Task8.

=> what is Task --> Runnable ke Objects.

            Runnable
                :
                :
            Executer Framework
                :
                :
            Thread Pool (Workers)
                :
                :
            w1 --> T1 (Execution)



1. Executor Framework

It is functional interface

interface Executor {
    void execute(Runnable r);
}

2. ExecutorService
=> It is a interface child of Executor interface

=> methods
1. execute(() -> Sout("Hello)); => come from parent => It is Consumer type. not return anything,exception lost
2. submit(); => exception not lost and return something

executor.submit(Callable ka object) (() -> 10+20);
return something has return type.

Integer i = executor.submit(() -> 10); // not good as it is asynchronous

Future<Integer> f1 = executor.submit(() -> 10);
=> Future is a data type class, expects asynchronously output.

=> Task submitted , Task run in background threads.
=> result stored in future.
=> f1.get():- can see output.
=> It is a special methods. It blocks current THread , jab tak ruke raho jab tak future ke andar value na aajye.



=> Callable is interface and it return something. and baki same as runnable.


3. shutdown(); => always likhna padta hai. ye andar se kahta hai ki new task ko accept nahi karega, current task jo perform ho rahe hai unko karega and then shut down ho jayega thread pool ko band kar dega.

4. shutdownNow() => ye running task ko bhi terminate karne ki request karega but depend karega OS par ye only request kar sakta hai.

5. invokeAll() => Take List<Collable> tasks 


6. invokeAny()





# Different Thread Pools

# 1. Thread Pool executor

=> configurable engine.
=> worker thread (Limited)
=> queue to hold extra tasks
=> rules how many thread , size of queue etc.

=> jab hum Executors.newFixedThreadPool(2) karte hai to vo andar se new ThreadPoolExecutor() hi karta hai isme bahut chijein constructor me deni padti hai so simplification ke liye

ThreadPoolExecutor(
    int currPoolSize;
    int maximumPoolSize;
    int keepAliveTime;
    TimeUnit unit;
    BlockingQueue<Runnable> workQueue;
);

currPoolSize:- (2) :- min no of thread workers jo alive rahe always.
maximumPoolSize:- (5) :- 2-5 workers ban sakte hai.
workQueue :- Fized size or unlimited size queue
KeepAliveTime :- we can increase our workermaximum to 5 , extra workers kitne time tak alive rahege if ye idle hai.

=> Rules:- 

1. if currThread < core pool size
create a thread ---> task execute.

2. else if queue has space put task in queue.

3. else threads < max
queue me nikalo new thread banao and new task ko queue me dalo
4. reject the task


=> Types of Queues
1. ArrayBlocking Queue :- Size is fixed
2. LinkedBlockingQueue :- infinite sized queue

=> almos time we use Executors class for creating ThreadPool

. FixedThreadPool() 
=> fixed o of threads + unbounded queue  => this can create memory issues

.cachedThreadPool
=> unlimitedTHread + No queue.
=> bahut jyada threads par memory jyada

.singleThreadPool
=> 1 worker thread + queue
=> make sare tasks serilizable 
=> works when we make ek baar me ek hi tasks ho.


.scheduleThreadPool 
=> Run tasks in future.
=> schedulor => .schedule(() -> {
    System.out.println("Hello);
},2,TimeUnit.SECONDS);

=> schedulor.scheduleAtFixedRate(
    () -> (), 0,2,TimeUnit.SECONDS
);
=> har baar fixed rate par hota rahe.


# Thread Rejection Policy
=> by default 
1. AbortPolicy 
Throw RejectionException
2. Discard Policy
Silently Policy => bekar, pata hi nahi chalega
3. DiscardOldestPolicy :- most used , 
OLdest Task ko remove kar dete hai.