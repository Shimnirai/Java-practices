import java.util.ArrayList;

public class Foreach1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();
        names.add("Yazhini");
        names.add("Sanjana");
        names.add("me");

        for(String s:names){
            System.out.println(s);
        }
    }
}
