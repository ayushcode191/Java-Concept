import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double happy = n;
        double sad = 0;
        for(int i=0;i<4;i++){
            double newH = happy*0.3+sad*0.5;
            double newS = happy*0.7+sad*0.5;
            happy = newH;
            sad = newS;
        }
        System.out.println(happy+" "+sad);
    }
}