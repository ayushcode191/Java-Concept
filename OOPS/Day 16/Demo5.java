public class Demo5 {
    public static void main(String[] args) {
        EngStudent es = new EngStudent("Ayush", 21, 101, "IIT Delhi");
        es.print();
    }
}

class Student {
    String name;
    int age;
    int rollNo;

    Student(){}
    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    

    void print(){
        System.out.println(name + " "+ age+","+rollNo);
    }
}

class EngStudent extends Student {
    String college;

    EngStudent(String name,int age,int rollNo,String college){
        super(name,age,rollNo);
        this.college = college;
    }
    void print() {
        super.print();
        System.out.println(college);
    }
}