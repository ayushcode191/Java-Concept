# Parallel Stream
=> Internally used multithreading


=> split data into chunks
=> Assign chunks to Thread
=> Process independently
=> combine result

=> Fork Join Pool.

=> what is splitIterator?
1. Traverse the element.
2. Decompose the source into parts.
3. Describe the source. (ordered,indexing,size etc for optimization).



# SplitIterator
Two imp methods
=> tryAdvance() // traversal
=> trySplit() // try to split the dataset


data -> fork -> Joining
fork-join

parallel stream + statefull operation => overhead increases => worst case.



=> when parallel strean can help?
1. Dataset is Huge. 
2. CPU Intensive work as CPU is multicore.
3. stateless operation
4. optimised data structure used then use it. Such as array.

=> Not better here parallel stream
=> Shared Mutable Resource
List<Integer> list
List<Integer> result


list.stream()
....
.forEach(x -> res.add(x));

If use Parallel stream then conflict occurs when two thread try to add at same index then race condition occurs and data loss ocuured.




