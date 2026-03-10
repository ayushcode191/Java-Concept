public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ayush";
        s1.age = 20;
        s1.rollNo = 101;
        s1.collegeName = "IIT Delhi";

        s2.name = "Vikas";
        s2.age = 21;
        s2.rollNo = 102;
        s2.collegeName = "IIT Bombay";

        s1.markAttendence();;
        s2.markAttendence();

        s1.print();
        s2.print();

    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String collegeName;

    void markAttendence() {
        System.out.println("Attendence marked by "+name);
    }

    void print() {
        System.out.println(name+" , "+age+" , "+rollNo+" , "+collegeName);
    }
}


// Java is almost complete object oriented programming language.