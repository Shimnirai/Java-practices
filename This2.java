class AreaOf{
    int length;
    int breadth;

    AreaOf(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void setArea(){
        int a = length*breadth;
        System.out.println("Area: " + a);
    }
}

public class This2 {
    public static void main(String[] args) {
        AreaOf ans = new AreaOf(45, 76);
        ans.setArea();

    }
}
