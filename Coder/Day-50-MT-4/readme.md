# Problems with Multi-Threading

1. Race condition
Program -> final state
depends on the order of execution of threads.



=> count++ => It is not single statement(atomic operation) , it is three
1. Read count from Memory
2. Increment count by 1
3. write updated value back


class Counter {
    int count = 0;

    void increment(){
        count++;
    }
}

main(){
    Counter c1 = new Counter();
    c1.increment();

}

Single-Thread -> No problem
Multi-Thread -> Problem


T1 , T2 




Steps       T1           T2
1.        Read c=0    
2.                     Read c=0
3.        c=c+1
4.                      c=c+1
5.        write 1      
6.                       write 1



=> Logically answer 2 hona chahiye tha but 1 hi hai .

=> It is a Race condition.
=> Bich me context switching ho jati hai.


=> Critical Section 
void increment(){
    count++;
}

=> Shared Resources
count++;

# Atomicity Problem

=> Any operation Atomic or Non-Atomic

=> Any operation that either happens completely or not at all.



=> Synchronized Block 
=> AtomicInteger



=> Atomic Operation
1. Assignment Operation
2. Refernces Assignment 
Student s1 = new Student()


=> Non-Atmoic Operation
1. x++;
2. y--;



=> Check Then Act -> Non-Atomic





double d = 112.234

64 bit 
32 then 32
Non atomic operation



# Problem of Visiblity
One Thread update the variable but another thread does not see the updated value.



# Problem of ordering

=> sequence in which instructions are executed.


int a = 1;
int b = 2;

=> JVM ki optimization and compilor or cpu ki vajah se reordering ho jati statements ki.

=> make sure ki single thread vale code me koi problem na aaye.




=> 

int x = 0;
boolean flag = true


Thread1 

x = 10
flag = true



Thread2
if(flag == true){
    sout(x);
}



# Thread-Interference :- Data consistency

=> Problem due to MultiThreading
1. Non atomic opn
2. Shared Resources
3. Race condition
4. Ordering/ visibility


=> how to handle
1. Synchronized
2. volatile
3. Atomic Integer
4. Proper lock mechanism