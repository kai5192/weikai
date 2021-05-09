package Chapter05;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){
        //判断一个整数是否为水仙花数，所谓水仙花数是指一个三位数，其个位数立方和等于其本身
        //例如：153 = 1*1*1 + 3*3*3 + 5*5*5
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number1 = scanner.nextInt();
        if(number1>99 && number1 < 1000){int c1 = number1 / 100 ;//百位
            int c2 = (number1 % 100) / 10 ; //十位
            int c3 = number1 % 10; //各位
            System.out.println("百位为" + c1);
            System.out.println("十位为" + c2);
            System.out.println("个为" + c3);
            if(number1 == c1*c1*c1 + c2*c2*c2 +c3*c3*c3){
                System.out.println(number1+"是水仙花数" );
            }else{
                System.out.println(number1+"不是水仙花数" );
            }
        }else {System.out.println("您输入的不是三位数");

        }
    }
}
