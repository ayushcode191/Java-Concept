public class Demo4 {
    public static void main(String[] args) {
        
        // checkEligibility(-5);

        // try{
        //     checkEligibility(-5);
        // } catch(IllegalArgumentException e){
        //     System.out.println(e.getMessage());
        // }

        checkEligibility(-5);

    }

    private static void checkEligibility(int age){
        /**
         * Recommended
        if(age <= 0){
            throw new IllegalArgumentException("Age can't be negative");
        }

        if(age > 18){
            System.out.println("You are eligible to vote");
        }

        */

        // Not recommended
        try{
            if(age <= 0){
                throw new IllegalArgumentException("Age can't be negative");
            }

            if(age > 18){
                System.out.println("You are eligible to vote");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
