public class Demo5 {
    public static void main(String[] args) {
        Box<String> b1 = new Box();

    }

    // yaha <?> alllowed nahi hai.
    public static <T> void fun(T a, T b){

    }
}

// yaha <?> wildcards allowed nahi hai
class Box<T> {

}

// <T> when, <?> when
// <?> when super extends and parent child vagera ho