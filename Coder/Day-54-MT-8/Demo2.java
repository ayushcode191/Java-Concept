import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
    public static void main(String[] args) {

        SeatBooking seatBooking = new SeatBooking();

        Thread t1 = new Thread(() -> {
            boolean value = seatBooking.bookSeat("Alice");
            System.out.println("T1 says "+ value);
        });

        Thread t2 = new Thread(() -> {
            boolean value = seatBooking.bookSeat("Bob");
            System.out.println("T2 says "+ value);
        });

        t1.start();
        t2.start();
        

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(seatBooking.seat);

    }
}

class SeatBooking {
    // String seat = new String("EMPTY");

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if(currentValue.equals("EMPTY") == false){
            return false;
        }

        return seat.compareAndSet("EMPTY", name);

        /*
        if(seat.equals("EMPTY")){
            seat = new String(name)
        }
        */

    }
}

// compare and set operation (CAS)