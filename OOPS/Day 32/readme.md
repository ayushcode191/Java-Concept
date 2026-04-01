                   List
                    :
                    :
ArrayList    LinkedList       Vector
                                :
                                :
                              Stack

=> Till Java21

# List
=> Elemets have a position.
=> Duplicate are allowed.
=> Insertion order preserved.
=> You can access element by index.


=> List Interface
Collection and List ke beech ek or interface hai SequenceCollection Interface hai and iske Methods hai
1. getFirst()
2. getLast()
3. removeFirst()
4. removeLast()
5. addFirst()
6. addLast()

=> Methods of List Interface
1. E get(index);
2. set(index, E value);
3. add(index, E value);
4. boolean addAll(index, Collection<? extends E>)
5. remove(index)
6. indexOf(Object value)
7. lastIndexOf(Object value)
8. listIterator() :-> forward, backward, insert, remove etc.
9. listIterator(int index) :- start from specific index
10. list.of(Collection) :- return immutable list
11. copyOf(Collection) :- return immutable list


=> Random access
=> Cache Friendly
=> Simple Structure

=> Three Constructor 

List<Integer> list = new ArrayList<>();
                   = new ArayList<>(initial capacity)
                   = new ArrayList(c);


=> Specific Method of ArrayList
1. ensureCapacity() => l.ensureCapacity(100) ;- jisse 100 tak aarayList doubled na ho
2. l.trimToSize() => if hame pata ab isse jyada size nahi hoga
3. capacity:- kitne element hold kar sakti, size:- currently kitne element hai.

=> LinkedList

// singly LinkedList
class Node<T> {
    T data;
    Node<T> next;
}
1 ---> 2 ---> 3 ---> 4

// Doubly LinkedList
class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;
}
1 <---> 2 <---> 3 <---> 4

=> Java use DoublyLinkedList and have two reference first and last


list.get(index): ye check karega ki first se jyada close hai ya last se jyada close hai vahi se start karega.


=> LinkedList use to implement Queue and Stack. 


=> Vector, Stack are legacy class (Old Java) jab Collection Framework nahi tha 
=> Stack => stack implemetation using Array
=> These two are thread safe but inko use nahi karke thread safe ke liye alag classes hai ArrayList, LinkedList ke liye
=> ye dono classes bahut slow hai.
