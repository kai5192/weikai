package Chapter05;
import java.util.Scanner;
public class If_test {
    public static void main(String[] args){
        System.out.println("请输入你的年龄");
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt();
        if(age>18){
            System.out.println("你的年龄大于18，要对自己的行为负责");
            }
        else{
            System.out.println("你的年龄小于18，放你一马");
    }double d1 = 11.0;
     double d2 = 12.0;
     if(d1 > 10.1 & d2 <20.0){
         double d3 = d1 +d2;
          System.out.println(d3);
     }int i1 = 10; int i2 = 5;int i3 = i1+i2;
     if ( i3 %5 == 0 && i3 % 5 == 0){
         System.out.println("i1与i2的和可以整除3和5");
     }int year = 2028;
     if ((year % 4 ==0 && year % 100 != 0) || year % 400 ==0 ){
         System.out.println(year + "是闰年");
     }else{System.out.println(year + "不是闰年");}

    }
}
