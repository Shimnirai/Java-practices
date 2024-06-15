// Single Inheritance//

class Ani{
    void eat(){
        System.out.println("eating..");
    }
}
class dog extends Ani{
    void bark(){
        System.out.println("barking...");
    }
}
public class Inheri1 {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
