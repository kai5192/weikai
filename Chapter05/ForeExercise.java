package Chapter05;

public class ForeExercise {
    public static void main(String[] args){
        //打印1-100之间所有9的倍数的整数，统计个数及总和
        int num_9 = 0;
        int sum_9 = 0;
        for(int i = 1;i<=100;i++) {
            if (i % 9 == 0) {
                System.out.println(i+"为9的个数");
                ++num_9;sum_9 += i;
            }
        }System.out.println("1-100之间所有的9的倍数的整数的个数为" + num_9 + "\n" +
                "它们的和为" + sum_9);

    }
}
