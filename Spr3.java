class Person{
    Person(){
        System.out.println("This is a Person class");
    }
}
class Student1 extends Person{
    Student1(){
        super();
        System.out.println("Student class Constructor");
    }
}

public class Spr3 {
    public static void main(String[] args) {
        Student1 s = new Student1();
    }
}
