public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Ayush";
        s1.age = 20;
        s1.rollNo = 101;
        s1.collegeName = "IIT Delhi";

        // Constructors => to construct an object 


        // default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.collegeName);

        // int x = 4; // local variable -> stack memory  => no default values => need to be initialized otherwise get error




    }
}

/**
 * Integer -> 0
 * floating 0.0
 * Boolean -> false
 * String -> null (nothing)
 */

class Student {
    String name; // information / data / characteristics => instance variable  => heap memory => they get default values
    int age;
    int rollNo;
    String collegeName;

    void markAttendence() { // behaviors
        System.out.println("Attendence marked by "+name);
    }

    void print() {
        System.out.println(name+" , "+age+" , "+rollNo+" , "+collegeName);
    }
}


// Java is almost complete object oriented programming language.