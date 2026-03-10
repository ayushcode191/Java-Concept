
public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Aditya");
        // Student s3 = new Student("Rohit",20);
        // Student s4 = new Student("Aman",21,101);
        // Student s5 = new Student("Ayush",20,102,"IIT Delhi");

        // System.out.println(s3.rollNo);
        // System.out.println(s3.collegeName);
        // System.out.println(s4.age);
        // System.out.println(s5.name);

    }
}

// Constructor chaining => ek constructor se dusre ko call karna
class Student {
    String name; // information / data / characteristics => instance variable  => heap memory => they get default values
    int age;
    int rollNo;
    String collegeName;

    // Student() {
    //     this("Unknown",0,0,"Unknown");
    // }

    // Student(String name){
    //     // this.name = name;
    //     this(name,0,0,"Unknown");
    // }

    // Student(String name, int age){
    //     // this.name = name;
    //     // this.age = age;
    //     this(name,age,0,"Unknown");
    // }

    // Student(String name, int age,int rollNo){
    //     // this.name = name;
    //     // this.age = age;
    //     // this.rollNo = rollNo;
    //     this(name,age,rollNo,"Unknown");
    // }

    // Student(String name, int age, int rollNo, String collegeName){
    //     this.name = name;
    //     this.age = age;
    //     this.rollNo = rollNo;
    //     this.collegeName = collegeName;
    // }

    // 2nd Method
    Student() {
        this("Unknown");
        System.out.println("I am in first constructor");
    }

    Student(String name){
        // this.name = name;
        this(name,0);
        System.out.println("I am in second constructor");
    }

    Student(String name, int age){
        // this.name = name;
        // this.age = age;
        this(name,age,0);
        System.out.println("I am in third constructor");
    }

    Student(String name, int age,int rollNo){
        // this.name = name;
        // this.age = age;
        // this.rollNo = rollNo;
        this(name,age,rollNo,"Unknown");
        System.out.println("I am in fourth constructor");
    }

    Student(String name, int age, int rollNo, String collegeName){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        System.out.println("I am in fifth constructor");
    }

}
