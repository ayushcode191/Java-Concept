public class Demo3 {
    public static void main(String[] args) {
        // int x= 100;
        // int y = 100;

        // System.out.println(x == y); // true

        Integer a = 200;
        Integer b = 200;

        // System.out.println(a == b); // false // it compare references

        // System.out.println(a.intValue() == b.intValue()); // true

        System.out.println(a.equals(b)); // true


    }
}


// how Integer class look (Conceptual )
/* 
public final class Integer {
    private int value;

    public Integer (int value){
        this.value = value;
    }

    public int intValue(){
        return value;
    }

    public static Integer valueOf(int v){
        // Give object Integer of x
    }

    public boolean equals(Integer y){
        return this.value == y.value;
    }
}
*/

// -128 to 127  tak 
