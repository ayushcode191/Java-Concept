

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 20,  101);
        Student s2 = new Student("Rohit", 21, 102);

        // Student.collegeName = "IIT Guwahati";

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo+" "+s1.collegeName );
        System.out.println(s2.name+" "+s2.age+" "+s2.rollNo+" "+s2.collegeName );

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo+" "+Student.collegeName );
        System.out.println(s2.name+" "+s2.age+" "+s2.rollNo+" "+Student.collegeName );
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    static String collegeName;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // static block => used for assigning the static variable => class load ke time run hoga 
    static {
        collegeName = "IIT Guwahati";
    }
}
