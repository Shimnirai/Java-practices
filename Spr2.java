// Super keyword example
// super class
class person{
    void message(){
        System.out.println("This is a person class");
    }
}
// subclass
class Student extends person{
    void message(){
        System.out.println("This is Student class");
    }
    void display(){
        // current class message
        message();
        //parent class message
        super.message();
    }
}
public class Spr2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.display();
    }

}
