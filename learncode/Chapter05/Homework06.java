package learncode.Chapter05;

public class Homework06 {
    public static void main(String[] args){
        //输出1-100之间不能被5整除的数，每5个一行
        //最外层循环1-100，
        //第二层输出被5整除的个数
        // 第三层是5的倍数则换行
        int j = 0;
        for(int i = 1;i <=1000;i++){
            if(i % 5 !=0){
                System.out.print(i + "不能被5整除");
                j++;
                if(j == 5){
                    System.out.print("\n");
                    j = 0;
                        }
            }
        }
    }
}
