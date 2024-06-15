// MultiLevel Inheritance//

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal1 {
    void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends Dog{
    void Weep(){
        System.out.println("Weeping");
    }
}

public class Inheri2 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.Weep();
        d.bark();
        d.eat();
    }
}
