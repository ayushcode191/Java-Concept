# Lock Free Concurrency

# Atomic Variables
=> operation -> single unit. (All or nothing)

1. Atomic Integer

=> Methods:-
1. .get()
2. .set(value)
3. incrementAndGet()
4. getAndIncrement()
5. decrementAndGet()
6. getAndDecrement
7. addAndGet(value)
8. getAndAdd(value)



2. AtomicLong (range jyada hoti hai)
=> id ke liye kaam aata hai.


3. AtomicBoolean 
=> Producer-Consumer Problem


=> so why not always synchronize 
=> Because it use locking mechanism  so increase overhead.



=> AtomicInteger count = new AtomicInteger(10);
count.incrementAndGet() => Atomic

if(count.get() > 4){
    count.incrementAndGet()
}

// ye multiple statement atomic nahi hai ye sirf single statement ko atomic manti hai.


4. AtomicReference

Student s1 = new Student();


Ex:- Seat Booking 

class SeatBooking {
    String seat = new String("EMPTY");

    boolean bookSeat(String person){
        if(seat.equals("EMPTY")){
            seat = new String(person);
            return true;
        }
        return false;
    }

}
// problem t1 and t2 sath me execute kare and problem aa jayegi.
=> multiple seat booking problem


class SeatBooking {

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if(currentValue.equals("EMPTY") == false){
            return false;
        }

        return seat.compareAndSet("EMPTY", name);

    }
}

// parallel two thread run ho rahi to kaise hoga
// inme se ek hi execute hoga ye conform hai.
=> Reason
1. Lock Signal

compareAndSet(-,-)

ek processor agar run kar raha to ye signal deta hai System Bus and Memory Controller ko ki baki sare processor at least 1 CPU Cycle(Bahut hi less time) peechhe raho mujhse.

2. Memory Controller

if dono thread ne same time par compareAndSet() ki sath me request di but ye electronic device hai to ek hi signal pass ho payega chahe pico second ka farak rahe.
=> andar se flip flop and gate kaam karta hai ek hi signal ja payega 


=> Java handle nahi karta Parallel ko CPU Karta hai manage.
