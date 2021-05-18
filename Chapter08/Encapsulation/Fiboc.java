import java.util.Arrays;

public class Fiboc {
    public static void main(String[] args){
        int[] arr = new int[20];
        int n = 19;
        A a = new A();
        a.fi(n, arr);
        System.out.println(Arrays.toString(arr));
    }
}
class A{
    public int fi(int n, int[] arr){
        if (n == 0||n == 1){
            arr[n] = 1;
            return arr[n];
        }
        else{
            return arr[n] = fi(n-1,arr) + fi(n-2,arr);
        }
    }
}

