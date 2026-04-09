# How to Compare in Java
=> when user defined data types.

=> Comparable Interface
=> I know how to compare myslef with another object of my type.

interface Comparable<T> {
    int compareTo(T o){

    }
}
=> functional interface -> only 1 abstract method


=> natural ordering follow karta hai.
=> one class one natural ordering

=> why return type is integer not boolean because we required three answer less equal greater. 
=> enum slow hai isilye use nahi kiya.



=> when use this.
=> Custom class => natural ordering obvious.



# Collections class 
=> utility class
=> many static method apply on any Collection.

=> Collections.sort();
=> .max();
=> .min();
=> .fill(list,0);
=> .reverse(list);
=> .shuffle(list);
=> .swap(list,a,b);
=> .binarySearch(list,element);
=> .frequency(list,element);


=> Collection.unmodifiableList(list);
=> .unmodifiableSet()
=> .unmodifiableMap()


=> Collections.emptyList();
.emptySet();
.emptyMap();


