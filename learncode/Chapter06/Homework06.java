package Chapter06;

public class Homework06 {
    public static void main(String[] args){
        char[] arr1 = {'a','z','b','c'};
        char[] arr2 = arr1;
        arr1[2] = '韩';
        for (int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i]);
        } System.out.print("\n");
        for (int i = 0; i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
}
