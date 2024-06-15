public class Static1 {
    static int a = 20;
    static int b;

    static{
        System.out.println("Static block initialized");
        b = a*4;
    }

    public static void main(String[] args) {
        System.out.println("From main method");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}
