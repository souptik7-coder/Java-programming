public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Souptik");
        Student s3 = new Student(22);
        System.out.println(s2.name);
        System.out.println(s3.age);
    }
}
class Student{
    String name;
    int age;
    Student(){     // non - parameterized constructor
        System.out.println("constructor is called");
    }
    Student(String name){     // parameterized constructor
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }

}
