public class Demo {
    public static void main(String[] args) {

        Box box = new Box();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=20; i++){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                box.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            
            for(int i=1; i<=20; i++){
                try{
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                box.consumer();
            }
        });

        t1.start();
        t2.start();
        
    }
}

class Box {
    Integer item;
    Boolean flag = false;

    void producer(int value){
        item = value;
        flag = true;
        System.out.println("Producer produces "+ item);
    }

    void consumer(){
        System.out.println("Consumer consumes "+ item);
        item = null;
        flag = false;
    }

    
}

// what if synchronize use kare but ye problem solve kar nahi payega.
// synchronization make sure ki dono me ek hi enter kare but ye to problem nahi kar payege solve.

// solution:--  agar code me while loop use kare to ye problem solve ho sakti hai jab tak ki item null hai infinite loop me.

// => volatile keyword use karege to cache se read nahi karegi.
// ye to busy waiting hai.
// iska demo2.java me code hai 
