/**
 * Types of Inheritence
 * Simple Inheritence
 * multi-level Inheritence
 * hierarchical inheritence
 * multiple inheritence (not supported in java through classes)
 */



public class Demo4 {
    public static void main(String[] args) {
        CSEEngineeringStudent cse1 = new CSEEngineeringStudent();
        cse1.attendLab();
        cse1.markAttendence();
    }
}


class Student {
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendence Marked");
    }
}

class EngineeringStudent extends Student {
    void attendLab(){
        System.out.println("Lab Attended for Eng Student");
    }
}


/**
 * Multi level Inheritence
 * A ---> B ---> C
 */

class CSEEngineeringStudent extends EngineeringStudent {
    void CSELabattend(){
        System.out.println("CSE Lab Attended");
    }
}


/**
 * Hierarchical Inheritence
 * 
 *     A
 *    / \
 *   B    C
 */

class MedicalStudent extends Student {
    void attendLab(){
        System.out.println("Lab Attended for medical student");
    }
}


/**
 * multilevel class
 * 
 *   A     B
 *    \   /
 *      C
 */

class Student2 {

}

// class uniqueStand extends Student, Student2 {

// } not supported in java
