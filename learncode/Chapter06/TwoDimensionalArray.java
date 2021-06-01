package learncode.Chapter06;

public class TwoDimensionalArray {
    public static void main(String[] args){
        //打印二维数组
        int[][] arr ={{0,0,0,0,0},{0,0,0,0}};
        for(int i = 0;i < arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }System.out.print("\n");
        }
    }
}
