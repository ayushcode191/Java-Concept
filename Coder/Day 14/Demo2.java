public class Demo2 {

    public static void main(String[] args) {
        Random r1 =  new Random(4,5);
        // Random r2 = new Random(r1); // Deep Copy
        // Random r3 = r1; // Shallow Copy

        System.out.println(r1.x +" , "+r1.y);
        addTen(r1);
        System.out.println(r1.x +" , "+r1.y);

    }

    static void addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random {
    int x;
    int y;
    Random(int x, int y){
        this.x = x;
        this.y = y;
    }

    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}