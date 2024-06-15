public class Foreach2 {
    public static void main(String[] args) {
        int []arr = {4, 5, 6, 7, 8, 9, 10};
        int ans = 0;
        for(int arr1: arr){
            ans = ans + arr1;
        }
        System.out.println(ans);
    }
}
