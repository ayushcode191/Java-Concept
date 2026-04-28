# Heap Memory

1. Young Generation
    1. Eden
    2. Survivor space s0
    3. survivor space s1

2. Old Generation

=> 3. String pool


=> Why these so many parts.

=> When we create an object 
Student s1 = new Student()
=> when create first time => object goes to Eden part
=> In this Allocation is very fast. almost object dead in this part only.
=> temporary object (less life) vale isme rahte hai kyonki kai sare object dead ho jate jisse garbage collection optimise

=> Jaise Jaise object old hota jata hai dire dhire survivor space me ove ho jata first s0 then s1

=> when after object creation first time garbage collection chal jata hai then if object dead nahi hota then JVM use s0 me move ho jata and ek baar or gc run hone par s1 mo move then again s0 then s1 and so on upto max Frequency (Ex:- 15)
=> and if uske baad bhi object dead nahi hota then JVM move to that object in Old generation of Heap memory.


=> when JVM sure object dead nahi hoga then move to old generation.


=> and  young generation me garbage collection more frequent run hota hai and old generation me less frequent gc run hota hai.

=> when GC run more times then program slow down.


=> Minor GC :- Jo Young memory me run hota hai.
har ek object ke pas age hota hai and gc ke ek cycle ke baad age +1 ho jati hai.


=> Major GC:- Jo old geberation me run hota hai.

=> Deep Scanning karni hoti hai object ke kitne reference variable hai less freqent, more expensive hota hai.


=> age ka factor old generation me nahi hota hai.


1. Survivor space overflow => to JVM object ko move kar deta old generation me.
2. Dynamic age :- Jab age bahut sari ke same hai to JVM old me move kar deta
3. Jab bahut bada object bane to JVM directly old generation me move kar deta hai.




# Types of References

1. Strong Reference (Strong with Res to GC) Student s1 = new Student() => ye wala hota hai.

2. Soft:-  SoftReference<Student> sr = new SoftReference<>() => ye jab tak rahega jab tak memory ki need na ho => sr.get() => return object if exist otherwise null => use:- cache implement

3. Weak:- WeakReference<Student> sw = new WeakReference<>(); => Ek cycle of GC tak rahta hai. Ex:- WeakHashMap , cache etc.

4. Phanton  (Less almost removed):- khud se nahi banate.
GC internally use karta hai ise




# GC Algorithm

1. Mark & Sweep
=> 1st step Marking :- Mark karta jo reachable nahi hai.
=> 2nd Sweaping jo mark hai. remove kar deta hai.
=> Major GC ka part old generation me run hota hai 
=> Bich me fregemnt chhod deta
=> Unoptimise

2. Mark Concept
=> Same as above but when sweep out then no fregmentaion
=> costly operation of moving object
=> Major GC Old gen


3. Copying
=> Minor GC => Young gen
=> Eden :- Jo reachable hai unko next step me copy karta hai and sab ko hata deta.
=> Optimise 



=> when GC run it stop the world.
:- When GC run => sare object scan and time lagta hai unke beech if  program run ho naye object ban jaye to kya isilye jvm program rok deta hai.
=> So We try ki GC baar baar run na ho.

=> Sequential GC
=> Modern GC => parallel GC :- Multiple Thread => Kam samay ke liye program rukta hai.


=> System.gc(); => static method 
=> No guantee only request kar sakte ho JVM se

=> Memoy leak => OutOfMemoryError => when heap memory full=> Heap Dump :- Screenshot of heap memory to analyze object connection etc.


