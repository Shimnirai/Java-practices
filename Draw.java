interface Drawable{
    void draw();
}

class rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

public class Draw {
    public static void main(String[] args){
        Drawable d = new circle();
        d.draw();
    }
}
