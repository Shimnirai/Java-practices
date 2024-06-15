public class Static5 {
    public static void main(String[] args) {
        Static5 e1 = new Static5();
        Static5 e2 = new Static5();
        Static5 e3 = new Static5();
        Static5 e4 = new Static5();

        e1.printId();
        e2.printId();
        e3.printId();
        e4.printId();

        Static5.printCount();

    }
    public static int count = 0;
    public int id;

    public Static5(){
        count++;
        id = count;
    }

    public static void printCount(){
        System.out.println("Number of Instance: " + count);
    }

    public void printId(){
        System.out.println("Instance ID: " + id);
    }
}
