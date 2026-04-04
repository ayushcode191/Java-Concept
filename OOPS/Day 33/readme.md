# Set Interface
=> Duplicates are not allowed.
=> Constant time Search Operation.

=> Count no of unique user visited on our website.

# Map Interface
=> Stores in Key-Value Pair.
=> Duplicate Key not allowed.
=> constant time Search of key and geting value of key.
=> Constant time means average.


=> Positional access is not allowed in Set/Map.
=> Order not maintained in this.


=> How internally Look Set
It uses bucket of array.
5 ko 5 index par 6 ko 6 index par.
but kitna bada array le.
so 5%n lenge and n size ka array lenge.

=> so problem of collision is there.
=> so har bucket ko linkedlist bana do.
=> agar string hui then uska hashcode se number layenge then modulus lenge.

=> Map
class Node<K,V> {
     K key;
     V value;
}
put (k,v){
    int i=k.hashcode()
    i%n
}
pura key,value store karege i%n me



=> In java jab hum set banate to vo internaly map hi banta hai.




