// Anonymous class

public class Demo4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.introduce();

        // Person p2 = new Guest();
        // p2.introduce();

        Person p2 = new Person() {

            // Can't have constructor
            String name = "Aditya";
            @Override
            void introduce(){
                greet();
                System.out.println("Hi I am a guest "+name);
            }
            // greet ko bahar call nahi kar sakte hai , introduce ke anadar call kar sakte hai
            void greet(){
                System.out.println("Hi I am "+name);
            }
        };

        p2.introduce();
        
    }
}


class Person {
    void introduce() {
        System.out.println("Hi, I am a person");
    }
}

// 1 use case only => why another seprate class
// class Guest extends Person {
//     @Override
//     void introduce(){
//         System.out.println("Hi I am a guest");
//     }

// }



// ek local anonymous call bhi hoti hai same anonymous ki tarah + effective final vala rule aa jata hai. 



/**
 * mostly used => static inner class > inner class > Anonymous class (replace by lambda) > Local inner class 
 */

