// String Methods
// StringBuilder -> not Thread safe
// StringBuffer -> Thread safe

// AbstractStringBuilder class extended by both the classes

// java.lang package me exist karte hai ye

class StringBuilder extends AbstractStringBuilder {
    byte[] values; // isme buffer space hota hai
    int count;  // kitna space bhara hua hai 
    in capacity; // initail 16 then increases double
}


// new StringBuilder()
// new StringBuilder(50); // initial capacity
// new StringBuilder("Java") // 16 + 4 = 20 bytes initially


// append()
// insert()
// delete()
// replace()
// reverse()
// charAt()
// setCharAt()
// length()
// capacity()
// ensureCapacity()
// trimToSize()

// transform /comparioson -> not here

// equals() vale method ko override nahi karta

// StringBuffer -> Thread Safe.

// StringBuilder very faster then StringBuffer 
// StringBuilder -> most widely used.



 