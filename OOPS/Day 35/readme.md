# Queue and Stack

=> Both can be implemented using Array or LinkedList.


           Iterable(I)
              :
              :
              :
           Collection(I)
           /   :
          /    :
      List(I)  :
      /      Queue(I)
 LinkedList   :    \
     (C)  \   :     \
           \  :       PriorityQueue(C)
            Deque(I)
            /
           /
    ArrayDeque(C) => It is a Array Implementation.Stack ki tarah bhi use karte hai.



# Internal Implemenatation.

Class ArrayDeque {
    ek array jisme rear and front pointer honge.

}


=> Better Class kon hai?
=> Preferred ArrayDeque Why?
Contogous memory => Cache friendly.
=> null insert nahi kar sakte ArrayDeque me. s it is prefeered.

=> Stack is Legacay class. 
=> ArrayDeque use karte Stack ke liye.



# PriorityQueue 
Binary Heap Internal implementation
Complete Binary Tree.
=> used Array.