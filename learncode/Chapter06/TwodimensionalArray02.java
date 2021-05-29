package Chapter06;

public class TwodimensionalArray02 {
    public static void main(String[] args){
        //创建一个列数不确定的二维数组
        //1
        //22
        //333
        int size1 = 5; //大小
        int[][] arr = new int[size1][];
        for(int i = 0;i<arr.length;i++){
            arr[i] = new int[i + 1];//开辟空间
           for (int j = 0; j <arr[i].length;j++){
               arr[i][j] = i + 1;//赋值
           }
        }for (int i = 0;i<arr.length;i++){
            for (int j = 0; j <arr[i].length;j++){
                System.out.print(arr[i][j]);
            } System.out.print("\n");
        }

    }
}
