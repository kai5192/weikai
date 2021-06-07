package learncode.Chapter12;

import java.util.Scanner;

public class TryCatchExercise04 {
    //用户输入不是整数，就提示它反复输入，直到输入一个整数为止
    public static void main(String[] args) {
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                System.out.println("请输入一个整数");
                String string =  scanner.next();
                int results = Integer.parseInt(string);//将字符串转化为整数
                bool = false;
                System.out.println(results);
            } catch (NumberFormatException e) {
                bool = true;
            }
        }while (bool);

    }
}
