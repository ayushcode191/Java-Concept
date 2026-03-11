public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);

    }
}

class Student {
    String name; // information / data / characteristics => instance variable  => heap memory => they get default values
    int age;
    int rollNo;
    String collegeName;
    // default constructor
    Student(){

    }

    // Parametarized Constructor
    // Student(String n, int a, int r, String c){
    //     name = n;
    //     age = a;
    //     rollNo = r;
    //     collegeName = c;
    // }

    // This Keyword
    Student(String name, int age, int rollNo, String collegeName){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    void markAttendence() { // behaviors
        System.out.println("Attendence marked by "+name);
    }

    void print() {
        System.out.println(name+" , "+age+" , "+rollNo+" , "+collegeName);
    }
}
