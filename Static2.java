public class Static2 {
    // static variable
    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1(){
        System.out.println("From m1");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println("The value of a is " + a);

    }
}
