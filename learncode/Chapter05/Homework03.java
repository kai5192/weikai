package learncode.Chapter05;

public class Homework03 {
    public static void main(String[] args){
        //判断一个年份是否为闰年
        //（1）能被100整除，但不能被4整除
        //（2）能被400整除
        int  num = 2004;
        if ((num % 100 != 0 && num % 4 == 0) || num % 400 == 0){
            System.out.println(num + "是闰年");
        } else {System.out.println(num + "是平年");

        }
    }
}
