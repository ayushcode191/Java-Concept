# Volatile vs Atomic

=> volatile nake sure karta hai ki CPU Ram se Data read kare Cache se nahi , visibilty ki problem ko dur karte hai.
=> Atomic Variable make sure special operation ye to complete excute hoge ya bilkul nahi , ye by default visibility late hai.


seat.compareAndSet(expectedValue, newValue)

=> ek hi thread kar sakti hai seat book.

=> kabhi scenerio ki dono thread kare execute ek ke baad ek , dono ke result miljaye
ise kahte hai-
# Lock Free Re-try Loop

Ex:-

Class LikeCounter {

}


# AtomicReferenceArray

int[] arr = new int[10];


AtomicreferenceArray<String> arr = new AtomicreferenceArray<>(5);

arr.set(0, "Aditya");

arr.compareAndSet(index: 2, ExpValue: "Rohan", newValue: "Sohan);

=> isse multiple seat ho and booking vali problem acche se solve ho jayegi.



=> AtomicInteger, AtomicLong, AtomicBoolean => ye tino bhi andar se CompareAndSet  hi use karte hao to isse bhi problem solve kar sakte hai. incrementAndGet()
=> ye andar se sara logic retry CAS sari chijein use karta hai.



# Compare & Set + Re-Try Logic

=> piche ki technique:- Compare And Swap 

read -> modifie -> write

=> pahle compare karo if same hai tabhi swap karo



=> Locking vs CAS

=> Lock me ek thread critical section ke andar hoti hai baki bahar hoti hai.
=> CAS me sari thread try karti hai but only one succeed.

=> CAS can use for limited operation. Lock safe hai.


=> CAS is problem ko khud se solve nahi karta hai isko
# ABA Problem

=> t1 ne A read kar liya and context switch ho gaya and then t2 ne read karke B me change kar diya and then A me change kar diya and then t1 ne matc kiya and replace kar diya and history ko ignore kar diya
=> But kabhi kabhi ye problem nahi karega jab history matter nahi karti hogi. jab history matter karti hogi tab problem karega ye.
=> isko dur karne ke liye hum versoning ka sue karte hai.

(value, version) ka pair

