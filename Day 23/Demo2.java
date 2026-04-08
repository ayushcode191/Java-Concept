

public class Demo2 {
    public static void main(String[] args) {
        // int status = paymentStatus2.SUCCESS;

        PaymentStatus status = PaymentStatus.FAILED;

        System.out.println(status.name());
    }
}

// Enum ---> Enumeration (Enumrated type)
// Enum ---> Predefined set of constants.


enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}

class paymentStatus2 {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}
