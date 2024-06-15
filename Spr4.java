class ParentClass {
    public boolean isTrue(){
        return true;
    }
}
class ChildClass extends ParentClass{
    public boolean isTrue(){
        boolean ParentResult = super.isTrue();
        return !ParentResult;
    }
}

public class Spr4 {
    public static void main(String[] args) {
       ChildClass ans = new ChildClass();
       boolean result = ans.isTrue();
        System.out.println(result);
    }

}
