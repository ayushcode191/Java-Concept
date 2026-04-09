import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya",95 );
        Student s2 = new Student("Rohit", 95);

        TreeSet<Student> tset = new TreeSet<>();
        tset.add(s1);
        tset.add(s2);

        System.out.println(tset.size()); // data loss -> if 1

    }
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        if(this.marks!=other.marks){
            return this.marks - other.marks;
        }
        return this.name.compareTo(other.name);
    }

}