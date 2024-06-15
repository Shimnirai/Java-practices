public class ObjQuestion {
    public static void main(String[] args){

        Area a = new Area(4,5);

        a.setDim();

    }

}

class Area{

    int length, breadth;

    Area(int l , int b){

        length = l;

        breadth = b;

    }

    void setDim(){

        int disp = length * breadth;

        System.out.println(disp);

    }

}
