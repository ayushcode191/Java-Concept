public class Demo6 {
    public static void main(String[] args) {
        try{
            checkEligibility(-4);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("Entered age was "+ e.getAge());
        }
    }

    private static void checkEligibility(int age) throws InvalidAgeException{
        if(age <= 0){
            throw new InvalidAgeException("Age can't be negative",age);
        }

        if(age >18){
            System.out.println("You are eligible to vote");
        }
    }
}

class InvalidAgeException extends Exception {
    private int age;
    public InvalidAgeException(String message,int age){
        super(message);
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}


