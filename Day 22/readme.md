# Object Class

=> Java.lang package 
=> Parent of all classes in Java.
=> By default all classes extend Object class.
=> Common Behavior that exist in all classes that are in Object Class.
=> Object obj = new AnyClass();
=> Because of polymorphism we  can give refernce variable of Object Class to point any class's object.

# Core Methods
=> toString()
=> equals()
=> hashcode()
=> getClass()

# Cloning
=> clone()

# Garbage Collection
=> finalize()

# Threading
=> wait()
=> notify()
=> notifyAll()


=> toString() => convert anything to string
public String toString() {

}
=> give String representation of an object.
=> Default Implementation => className@HexCode


=> equals() => compare to object and return true and false

public boolean equals(Object obj){
    // DEfault Imp
    // compare two refernces
}
// same as s1 == s2 (By default)


=> hashcode() => return an integer of an object in hexadecimal format.

public int hashCode(){
    // Default Implemenation

}

// Imp Rule 
=> If two objects are equal then their hashes must be equal.
=> But Reverse might not be true.



// getClass() => return run time class of an object.
s1.getClass() => return Object of Class Type 
s1.getClass().getName() => return Class Name

public final Class <?> getClass() {
    // default Implemenation
    // can not override as it is final
}



=> clone() => create copy of an object

protected Object clone() throws CloneNotSuppportedException {
    // default Implementation
}
// we can override it when class inplements cloneable Interface. (This Interface is marker interface as its body is empty).

=> Not every object should be cloneable.

=> By default shallow copy 
=>  If we want deep Copy then have to override it

=> finalize() => use before by garbage collection.
=> Now deprecated as it is unpredicatble unsafe unreliable.


=> wait(), notify(), notifyByAll().


// Primitive classes ke upar Object class ke mthod nahi laga sakte. but inki wrapper class ke Upar Object Class hoti hai.

