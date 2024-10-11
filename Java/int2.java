import java.io.*;

interface int2 {
    void changeGear(int a);
    void speedUp(int a);
    void Brakes(int a);
}
class Bicycle implements int2 {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void Brakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + "Gear: " + gear);
    }

    class Bike implements int2 {
        int speed;
        int gear;


        @Override
        public void changeGear(int newGear) {
            gear = newGear;
        }

        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
        }

        @Override
        public void Brakes(int decrement) {
            speed = speed - decrement;
        }

        public void printStates() {

        }
    }

    class CFG {
        public static void main(String[] args) {
            Bicycle b = new Bicycle();
            b.changeGear(5);
            b.speedUp(6);
            b.Brakes(3);

            System.out.println("Printstatement: ");
            b.printStates();

        }
    }
}