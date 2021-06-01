package learncode.Chapter06;

public class YangHui {
    public static void main(String[] args){
        /*
        编写一个杨辉三角
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        从第三行开始 arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
         */
        //先创建一个二维数组
        //最外层循环给每个数组开辟空间(i+1)
        //定义值
        //输出
        int[][] arr = new int[5][];
        for (int i = 0;i < arr.length;i++){
            arr[i] = new int[i+1];//开辟空间
            for (int j = 0;j < arr[i].length;j++){
                if(j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else {arr[i][j] = arr[i-1][j-1] + arr[i-1][j];

                }
            }
        }for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }System.out.print("\n");
        }


    }
}
