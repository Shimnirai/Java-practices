import java.io.*;

public interface int1 {
    final int a = 10;
    void display();
}

class TestClass implements int1 {
    public void display(){
        System.out.println("Shimni");
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
