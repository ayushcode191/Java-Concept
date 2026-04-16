# Optional Chaining and Parallel Streams

=> Optional Classes
In Java there is a problem called nullPointerException.

String name = getName();

if(name !=null){
    int len = name.length;
}

to kini checks lagaye.

Class User -> Address -> String city

isme bahut sare null checks

if(user != null){
    if(user.getAddress() != null){
        if(u.getAddress().getCity() != null){

        }
    }
}

// Null check Hell
// compilicated check

=> Problem with null

String name = getName();
null means :- empty name or error, expected 
ambigous rakhta confirm nahi batata 



=> In java 8 -> Optional Class

=> It is a wrapper to an object

Optional<T>
Optional<String> :- means iske andar value ho bhi sakti or nahi bhi ho sakti


Optional<String> name = getName();
=> It may or may not contain a value.

// expect Consumer
name.ifPresent(System.out::println)


=> String name = null;  x Bad design
=> Optional<String> name = Optional.empty();  // Good Design.

=> Optional<String> name = Optional.of("Aditya");


Class Optional<T> {
    private final T value;
}

(value == null) empty
(value != null) present

=> Creating Optional

Optional<String> n = Optional.of("Aditya");

Optional<String> n = Optional.ofNullable("Aditya") // yaha null bhi aa sakta hai.

n.ifPresent()
Optional.empty()



=> Getting value from Optional
Optional<String> name = getName();

String name2 = name.get(); // NoSuchElementException if null


ispresent()

if(name.isPresent()){
    String s = name.get();
}
// but iska fayda kya hua lamba to utna hi hai

// ifPresent() 
name.ifPresent(System.out::println)


// orElse():- fetch value

String s = name.orElse("Unknown);

// orElseGet()
// orElseThrow()
// ifPresentOrElse()


// Optional Transformation

map()
flatMap()
filter()

User{
    Address -> city
}

Optional<User> user = getUser();

user.map(x -> x.getAddress())
    .map(y -> y.getCity())
    .ifPresent(z -> System.out::println)


user.map(user::getAddress())
    .map(Address::getCity)
    .ifPresent(System.out :: println)


// Optional = Mini Stream
=> one value or No value (empty / null)



=> Optional

if not sure return null 
m1(){

}

// Optional as Data Type :- Not a good decision
class x {
    Optional<String> name; // not recommended
}



Stream and Optional
Stream 0 to many element
Optional 0 or 1 element

=> Both together handle maybe value insode multiple values


List<User> users = may have email or not

for(User u : users){
    if(u.getEmail()!=null){
        res.add(u.email);
    }
}

email :- Optional<String> email

users.stream()
    .map(u -> u.getEmail()) // return Stream<Optional<String>>
    .filter(x -> x.isPresent())
    .map(x -> x.get())
    .toList();
