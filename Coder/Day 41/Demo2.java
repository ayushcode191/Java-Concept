import java.util.Optional;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Demo2 {
    public static void main(String[] args) {
        
        // Optional<User> user = getUser();

        // if(user != null){
        //     Address address = user.address;

        //     if(address != null){
        //         String city = address.city;
        //         if(city!=null){
        //             System.out.println(city);
        //         }
        //     }
        // }

        // user.map(x -> x.address)
        //     .map(y -> y.city)
        //     .ifPresent(System.out::println);

        // Optional<Optional<Address>> address = user.map(x -> x.address);

        // user.flatMap(x -> x.address)
        //     .map(y -> y.city)
        //     .ifPresent(System.out::println);




        // Optional<String> name = Optional.of("Aditya");
        
        // Optional<String> result = name.filter(x -> x.length() > 5);

        // System.out.println(result.orElse("Empty"));


        Optional<String> name = Optional.of("Aditya");

        name.map(x -> x.length())
            .filter(len -> len > 4)
            .ifPresent(System.out::println);

        
        
    }

    // private static User getUser() {
    //     Address a = new Address();
    //     a.city = "Delhi";

    //     User u = new User();
    //     u.address = a;

    //     return u;
    // }

    private static Optional<User> getUser() {
        Address a = new Address();
        a.city = "Delhi";

        User u = new User();
        u.address = Optional.of(a);

        return Optional.of(u);
    }
}

class User {
    public Optional<Address> address;
}

class Address {
    public String city;
}


// map() -> Function T->R
// if value is presnt then only apply map, and return optional Else  -> remains Empty

// flatMap() -> agar Optional ki chaining hai then use it.

// filter() -> check a condition, if true keep the value else do nothing


// stream() -> [1,2,3,4,6,7,5]

// Optional ---> [user]


