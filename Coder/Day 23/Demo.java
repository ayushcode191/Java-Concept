
public class Demo {
    public static void main(String[] args) {
        int status = paymentStatus.SUCCESS;

        System.out.println(status);

        int status2 = 100; // hai hi nahi type safetyy nahi run time bug aa jayege.

        if(status == Role.ADMIN){ // run time bug

        }
    }
}


// payment status ---> success, failed, pending  
// final

/**
 * Problems with this approach.
 * 1. Type Safety.
 * 2. Poor Readability
 * 3. No Grouping of related entities
 */
/**
 * Can we used String in the place of int.
 * String comparison slow and complecated related to casing etc.
 * Duplicate Problem in both case integer and string.
 */

class paymentStatus {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;



}