// Super keyword example
// Base class Vehicle
class Vehicle{
    int maxSpeed = 120;
}
// subclass car extending vehicle
class car extends Vehicle{
    int maxSpeed = 180;

    void display(){
        // print maxSpeed of base class vehicle
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

public class SprKeyword {
    public static void main(String[] args) {
        car ans = new car();
        ans.display();
    }

}
