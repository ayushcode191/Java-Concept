import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 21;

        // System.out.println(s1.toString());
        // System.out.println(s1); // By default toString() call ho jayega.

        Student s2 = new Student();
        s2.name = "Ayush";
        s2.age = 21;

        /**
         * Student s3 = null;
        Integer i = 20;
        System.out.println(s1.equals(i)); // classCastException
        System.out.println(s1.equals(s3)); // NullPointerExcpetion
        /* */

        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode() == s2.hashCode());
        
        // System.out.println(s1.getClass().getName());
        // System.out.println(s2.getClass().getName());

        // System.out.println(s1 instanceof Student);
        // System.out.println(s1 instanceof Object);

        Student s4 =  (Student) s1.clone();
        System.out.println(s4.toString());
        

    }
}

// instanceOf Operator => check if an object is instance of a class or any of its subclass

class Student implements Cloneable{
    String name;
    int age;

    @Override
    public String toString() {
        return (this.name +" , "+ this.age);
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;

        if(obj == null) return false; // avoid NullPointerException

        // Check if both class are of type Student
        // Avoid ClassCastException
        if(obj.getClass() != this.getClass()) return false;
        Student s = (Student) obj;
        return this.name == s.name && this.age == s.age;
    }

    @Override
    public int hashCode() {
        // int result = 17; // Prime No
        // result = result * 31 + age;
        // result = result * 31 + ((name == null) ? 0 :  name.hashCode()); // String hashCode ko override karti hai.

        // return result;

        return Objects.hash(name, age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
