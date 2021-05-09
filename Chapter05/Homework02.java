package Chapter05;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args){
        //判断一个整数，属于哪一个范围
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = scanner.nextInt();
        if(number1 > 0){
            System.out.println(number1+"大于0");
        }else if(number1 == 0){
            System.out.println(number1+"等于0");
        }else {
            System.out.println(number1+"小于0");
        }
    }
}
