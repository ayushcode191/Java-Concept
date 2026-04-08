public class Demo {
    public static void main(String[] args){

        College college =new College("IIT Delhi","Delhi");

        Student s1 = new Student(21, "Ayush",college);
        System.out.println(s1.getName()+" "+s1.getAge());

        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "IIT G";
        System.out.println(s1.getCollege().name);

    }
}

// Immutable class (Not purely immutable)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    // getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public College getCollege(){
        return this.college;
    }
}


class College {
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }


}