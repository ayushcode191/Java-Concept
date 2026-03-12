public class Demo3{
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.attendLab();
        es.markAttendence();

        Student s1 = new Student();
        s1.markAttendence();
        // s1.attendLab(); => wrong
    }
}

/**
 * parent (Super Class) ---> child (subclass)
 */


class Student {
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendence Marked");
    }
}

class EngineeringStudent extends Student {
    void attendLab(){
        System.out.println("Lab Attended");
    }
}