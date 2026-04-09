// problem of immutability

public class Demo3 {
    public static void main(String[] args) {
        String s = "";

        for(int i=0;i<5;i++){
            s += i;
            System.out.println(s);
        }
    }
}

// "0", "01", "012", "0123", "01234"

