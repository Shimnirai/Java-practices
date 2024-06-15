public class NestedLoop2 {
    public static void main(String[] args) {
        for(int i=1; i<30; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
            if(i == 20){
                break;
            }
        }
    }
}
