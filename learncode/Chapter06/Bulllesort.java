package Chapter06;

public class Bulllesort {
    public static void main(String[] args){
        //编写一个冒泡排序法
        int[] array1 = {5,4,3,2,1,6};
        int length1 = array1.length;
        int i = 0;
        do{i++;
            if(i == length1 ){
            break;
        }if(array1[i] < array1[i - 1]){
               int temp = array1[i];
               array1[i] = array1[i-1];
               array1[i-1] = temp;
               i = 0;
            }
        }while (true);
        for (int j = 0;j<array1.length;j++){
            System.out.print(array1[j]);
        }
    }
}
