# Strings
=> Character -> esa symbol jo human read kar sake
'A','a','1','$' etc.
=> primitive data tupe -> char

=> String is sequence of characters.
=> so String is Character Array.

=> why String ?
=> for functionality jisse manually algorithm na likhna pade.
=> String is abstraction of character array.

=> java.lang.String
class String {

}

String s = new String();
String s = "Hello";

=> String class is immutable class.
=> final class
=> all method final
=> setter remove
=> why immutable => widely used class. => so we dont want to change object again and again.

=> Two ways
=> Strng literal
=> new 

=> String literal => 
String s = "Hello";

=> String pool (Part of heap memery) me banega s object and refernce stack memory me and jab again 
String s1 = "Hello" baegato s2 bhi usi ko point karega.

=> new 
String s = new String("hello");
=> normal heap memory me banega and again alag alag banega
=> "hello" string pool me bhi literal ban jayega but usko koi point nahi kar raha hoga
=> eqauls method String me hamesha content check hoga.


=> Golden Rule
only compile time constants go to string pool automatically.
runtime created string go to heap.


// conceptual view of String class

public final class String {
    private final char[] values; // till Java 9
    private final byte[] values; // After Java 9 => stores unicode represenattaion of characters
    private final byte coder; // 0 or 1
    private int hash;
}

private final byte coder; // 0 or 1 
// 0 if comes under ASCII limit -> Latinn1
// 1 if not then  UTF-16


// String optimization
1. String pool
2. byte array shift from character array to save memory.
3. caching of hash code => to avoid re calculating hashes.

