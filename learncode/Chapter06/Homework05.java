package Chapter06;

public class Homework05 {
    public static void main(String[] args){
        /*
        随机生成10个整数（1-100的范围）保存，
        并倒叙打印以及求平均值，求最大值和最小值的坐标，
        并找出里面是否有8
        Math.random()生成[0,100)
         */
        //生成数组
        int[] arr = new int[10];
        int count = -1;
        for (int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100) + 1;
        } int maxnum = arr[0];
        int minnum = arr[0];
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[arr.length - i-1] + "\n");
            if(arr[i] > maxnum){
                maxnum = arr[i];
            }if(arr[i] < minnum){
                minnum = arr[i];
            }
        }System.out.print("最大值为:" + maxnum);
        System.out.print("最小值为:" + minnum);
        if(count != -1){System.out.print("里面有8:" );
        }

    }
}
