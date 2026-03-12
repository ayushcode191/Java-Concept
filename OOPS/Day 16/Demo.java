
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withDraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withDraw(int amount){
        balance -= amount;
    }

    // getters and setters
    public double getBalance(){
        return balance;
    }
}


class Student {
    private String name;
    private int rollNo;
    private int age;
    private String collegeName;

    Student(String name,int rollNo,int age, String collegeName){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.collegeName = collegeName;
    }

    // getters and setters
    // we can add validation in method so we use getters and setters. instead of directly giving access to fields.

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCollegeName(String collegeName){
        // validate if college Exist
        this.collegeName = collegeName;
    }

    public String getCollegeName(){
        return collegeName;
    }
}

