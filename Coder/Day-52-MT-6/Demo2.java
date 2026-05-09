public class Demo2 {
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


// volatile keyword use karege to cache se read nahi karegi.
class Box {
    volatile Integer item;
    volatile Boolean flag = false;

    synchronized void producer(int value){

        while(flag == true){
            // do nothing
        }

        item = value;
        flag = true;
        System.out.println("Producer produces "+ item);
    }

    synchronized void consumer(){

        while(flag == false){
            // do nothing
        }

        System.out.println("Consumer consumes "+ item);
        item = null;
        flag = false;
    }

    
}

// Race Condition occurs is produce but not print and context switch ho jaye but iski problem dur karne ke liye synchronize keyword use kar lege.

// but synchronize use karge to infinite loop me chala jayega deadlock ho jayega. then better Approach kya hai.

// => waiting :- wait() , notify(), notifyAll()

// Thread Communication (Problem)

// => Shared Resources 
// => Condition
// => Waiting

