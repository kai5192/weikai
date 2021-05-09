package Chapter05;

public class Stars {
    public static void main(String[] args){
/*
    1.先打印一半的金字塔
    * //第 1 层 有 1 个*
    ** //第 2 层 有 2 个*
    *** //第 3 层 有 3 个*
    **** //第 4 层 有 4 个*
    ***** //第 5 层 有
    2.打出来空格

    3. 打印整个金字塔
        * //第 1 层 有 1 个* 2 * 1 -1 有 4=(总层数-1)个空格
       *** //第 2 层 有 3 个* 2 * 2 -1 有 3=(总层数-2)个空格
      ***** //第 3 层 有 5 个* 2 * 3 -1 有 2=(总层数-3)个空格
     ******* //第 4 层 有 7 个* 2 * 4 -1 有 1=(总层数-4)个空格
    ********* //第 5 层 有 9 个* 2 * 5

 */
        int sum = 15 ;//层数
        for(int i = 1;i <= sum;i++){
            for(int k = 1;k <= sum -i;k++){
                System.out.print(" ");
            }//打印空格
            for(int j = 1;j<= 2 * i - 1;j ++){
                if(j == 1 || j == 2 * i - 1 || i ==sum){

                System.out.print("*");//打印星星
                     }else{ System.out.print(" ");//镂空
                }
            }System.out.print("\n");
        }
    }
}
