//Hierarchical Inheritance//

class Animal1 {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("barking...");
    }
}
class cat extends Animal1{
    void meow(){
        System.out.println("meowing...");
    }
}
public class Inheri3 {
    public static void main(String[] args) {
        cat c = new cat();
        c.meow();
        c.eat();
    }

}
// Multiple inheritance is not supported in java.
//Why multiple inheritance is not supported in java?
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.