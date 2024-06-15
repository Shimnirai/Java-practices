import java.io.*;
public class Static4 {
    public static void main(String[] args) {
        gfg.NestedClass obj = new gfg.NestedClass();
        obj.disp();
    }

    public class gfg{
        private static String str = "This is new type of Static";

        static class NestedClass{
            public void disp(){
                System.out.println(str);
            }
        }
    }
}
