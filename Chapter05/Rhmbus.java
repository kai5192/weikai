package Chapter05;

public class Rhmbus {
    public static void main(String[] args){
/*


 */
        int sum = 5 ;//层数
        for(int i = 1;i <= sum;i++){
            for(int k = 1;k <= sum -i;k++){
                System.out.print(" ");
            }//打印空格
            for(int j = 1;j<= 2 * i - 1;j ++){
                if(j == 1 || j == 2 * i - 1 ){

                    System.out.print("*");//打印星星
                }else{ System.out.print(" ");//镂空
                }
            }System.out.print("\n");
        }
        for(int i = sum - 1;i >= 1;i--){
            for(int k = 1;k <= sum -i;k++){
                System.out.print(" ");
            }//打印空格
            for(int j = 1;j<= 2 * i - 1;j ++){
                if(j == 1 || j == 2 * i - 1 ){

                    System.out.print("*");//打印星星
                }else{ System.out.print(" ");//镂空
                }
            }System.out.print("\n");
        }


    }
}
