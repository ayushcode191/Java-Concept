# Collection Framework
         
         Object
            :
            :
        Iterable
            :
            :
        Collection
            :
            :
List       Queue     Set



# Iterable Interface
=> let;s take a collection it can be ArrayList, LinkedList, Stack, Queue, Set or Map , we have to iterate over it.

=> List<Integer> list = new ArrayList<>();
[2,3,4,5,7,8]
=> we can use for loop 
for(i=0;i<list.size();i++){
    System.out.println(list.get(i));
}

=> We can't use for loop on all 

=> Data Structure can be of two Type
1. Ordering Maintain => ArrayList, LinkedList
2. Not maintain ordering => Set, Map
=> Although LinkedHashSet and LinkedHashMap are special data structure that can maintain order. But they come up with an overhead, Will discuss in upcoming topics.

=> ArrayList me indexing hoti hai. random access

=> List<Integer> list = new LinkedList<>();
for(i=0;i<list.size();i++){
    System.out.println(list.get(i)); // head pointer head se start karega and O(n) lega har time. to ye not optimise
}

=> So solution is Iterable interface of Java.

=> Iterable:- It is the root interface that represent any object whose element can be traversed one by one.

=> Let's take an arrayList
[2,3,4,7,10,9]

=> unknown object ko call karega.
=> hasNext() => check next element exist or not?
=> next() => next elment lake dega.

Iterable => iterator()  
Iterator => is a interface that contain hasNext() and next() method.


// Both use Generics
interface iterable {
    Interator iterator();
}


interface Iterator {
    hasNext();
    next();
}


ArrayList indirectly iterable interface ko implement karna hoga. then iterator() method ko implemet karna hoga and iterator object return karna hoga but iterator to interface hai iska object to ban nahi sakta to ek class ko isko implement karna hoga.

class ArrayList {
    Iterator iterator(){
        return new ArrayListIterator();
    }
}

class ArrayListInterator implements Iteraor {
    hasnext();
    next();
}




=> How different collection conceptually implement Iterable/ Iterator.

1. ArrayList:- 
[1,2,3,4,5];

class ArrayList implements Iterable {
    private Integer[] arr;
    private int size;

    @override
    public Iterator iterator(){
        return new ArrayListInterator();
    }

    // As a inner class
    class ArrayListIterator implemets iterator {
        int pos = 0;
        @override
        public boolean hasNext(){
            return pos < arr.size()
        }

        @override
        public Integer hasNext(){
            return arr[pos++];
        }
    }
}


2. LinkedList:- 
1 --> 2 --> 3 --> 4 --> 5

class LinkedList implements Iterable {
    static class Node {
        int data;
        Node next;
    }
    Node head;

    @override
    public Iterator iterator(){
        return new LinkedListInterator();
    }

    // As a inner class
    class LinkedListIterator implemets iterator {
        Node cur = head;
        @override
        public boolean hasNext(){
            return curr != null;
        }

        @override
        public Integer hasNext(){
            int data = curr.data;
            curr = curr.next;
            return data;
        }
    }
}



=> Iterable
iterator()
forEach()
splitIterator()

=> Iterator
hasNext();
next();
remove();
forEachRemaining();


