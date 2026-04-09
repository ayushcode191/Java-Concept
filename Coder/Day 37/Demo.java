import java.util.*;

public class Demo {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aditya",101,85 ));
        list.add(new Student("Ayush",102,90 ));
        list.add(new Student("Vaibhav",103,88 ));
        list.add(new Student("Shivani",104,87 ));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByRollNo();
        Comparator<Student> c3 = new SortByMarks();
        // Collections.sort(list,c2 );

        // Annonymous class
        // Collections.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.name.compareTo(o2.name);
        //     }
        // });


        // Lambda Expression
        Collections.sort(list, (s1,s2) -> s1.marks - s2.marks);

        for(Student s: list){
            System.out.println(s.name+" "+s.rollNo+" "+s.marks);
        }

    }
}

// Annonymous class

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

}

class SortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }

}

class SortByMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks-o2.marks;
    }

}

class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}