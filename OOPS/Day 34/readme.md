# Set

        Iterable (I)
           :
           :
           :
        Collection (I)
           :
           :
           :
          Set(I)
        /     \
       /        \
    HashSet(C)   SortedSet (I)
       :            \
       :              \
   LinkedHashSet(C)   Navigable Set (I)
                        \
                        \
                      TreeSet (C)



=> Set ke Pas kuch special method nahi hai sare Collection ke andar hi aa jate hai.


# Map
// isme bhi SortedMap & NavigableMap Interface hai.

        Map
         :
         :
         :
      /   \
     /     \
HashMap     TreeMap
   :
   :
LinkedHashMap   



// HashTable -> Legacy class 
// Thread Safe
// today not prefer use



// ConcurrentHashMap used for Thread Safety. 


      HashTable(C)
          :
          :
          :
      Properties(C) => Specialized Map

=> represent configuration data
username = admin
password 123 
text based



// WeakHashMap  
=> rarely used
=> cache like 
=> weak reference 

=> less use cases => due to memory management



// IdentityHashMap
=> Normal HashMap => equality based. (equals method)
=> not based on logical equality , == operarator par based hai.
=> Graph algorithm me  used case.


// EnumMap

enum Day{
   MON,
   TUE,
   WED
}

Map<Day,Integer> map = new HashMap<>();
map.put(MON,1);
map.put(TUE,2);
=> not so optimised

=> in enum limited value, every value has ordinal value
=> better distrubution (almost zero collision).
=> Not used Hashing tech
=> Memory efficient
=> not allowed null key.
=> null value allowed.

Map<Day,Integer> map = new EnumMap<>();
=> Iteration order preserved.


// ConcurrentHashMap
=> Latest Thread Safe Map


