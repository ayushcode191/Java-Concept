public class Demo4 {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(10,"Hello");

        
    }
}

// generic class
class Pair<T,U> {
    T first;
    U second;
    
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public U getSecond() {
        return second;
    }
    public void setSecond(U second) {
        this.second = second;
    }
    
    
}
