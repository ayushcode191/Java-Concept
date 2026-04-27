# How JVM use Memory
1. Memory allocate
 int x = 4; 
 Student s1 = new Student(); => Heap Memory

2. Memory use / update
    x = x+1;

3. Memory Deallocate


# Core Problem in different Programming Language
=> Manually Deallocating 

=> Garbage Collection

# Then Why Memory Management in Java 
=> Optimize code 

Ex:- Let's Create an object of large size in memory.
=> Java jab tak clear nahi kar payega jab tak koi isko point kar raha ho.

=> Memory Leakage
List<Student> list = new ArrayList<>();
ye grow hota jayega
and out of memory ho jayega 
so we take care of dereferencing.

=> Due to poor memory management performance gets degraded.

=> How often GC run in heap memory.
=> when it runs normal flow of program slow down.

=> OutOfMemoryError => in heap memory
=> StackOverFlowError => in stack memory



# Java Memory
=> why need of divide memory.

JVM
    Objects
    Threads
    variables -> long lived
    Temporary

So we divide the memory to seprate responsibility.


4 Types of Memory

1. Heap      => Thread Share
2. Method Area  => Thread Share
3. Stack Memory  => Thread Specific
4. Program Counter => Thread Specific

=> Thread share me lock ki jarurat hogi.

=> Native Method Stack :- for interacting with code of other language.

1. Heap Memory :- HUge chunks of memory
Object stored via new keywords
Garbage Collection works on Heap Memory.


2. Method Area
=> Class blueprint or metaData of Class
=> Name 
=> KIs ko inherit karti , kon se interface implement
=> Method and parameter, variable inke return type
ByteCode , JIT Compiler 
=> class loading
=> static variable stores here.
=> all types of methods stores in method area.


3. Stack Memory
=> LIFO
=> Execution Memory.
=> local variable
=> current method jo execute ho raha vo store karte hai.


4. Program Counter
=> Stores address of current instruction jo execute ho raha hota hai.




Demo.java => Demo.class

1. JVM start
2. Class Loading

class Loader
i. search Demo.class
ii. Read the byte code
iii. Load the class in method area
iv. create entry in method area


|class Demo                   |
|parent : object              |
|method: main(String[] args)  |
|byte code__________          |
|_____________________________|

Method Area


3. Main Method execution start
main Thread create -> specific memory initialize
1. stack space
2. PC


|                  |       |_____|      heap memory
|                  |       PC
|                  |
|                  |
|__________________|
Stack of main Thread





#  Stack Memory in Depth

:- stack frames me divide hoti hai.
=> local variable
=> method parameters
=> reference variable
=> return address


=> Grows and Shrink Automatically
=> Memory is auto cleaned.
=> Fast and optimized operation push and pop operation.

=> StackOverFlowError :- when stack memory full
=> Stack memory :- less flexible and limited space.



# Heap Memory
=> Objects => unpredicatble life and behavior
=> Garbage Collector 
=> Dynamically 

=> all objects. (new )
=> Instance Variables
=> Arrays.
=> String (via new)


=> Properties
1. Shared across Threads.
2. Dynamic in nature.
3. min and max space can indicate

=> Manage by GC
=> Slower than stack memory


# Object Creation
main() {
    Student s1 = new Student("Aditya",20)
}

=> Heap Architecure as a graph.