package learncode.Chapter04;
import java.util.Scanner;
public class Input {
    //编写一个main方法
    public static void main(String[] args){
        //演示接受用户的输入
        //1. 引入Scanner类所在的包
        //2. 创建Scanner对象,new创建一个对象
        Scanner myscanner = new Scanner(System.in);
        //3. 接收用户的输入
        System.out.println("请输入你的名字");
        String name = myscanner.next();//接受用户的输入
        System.out.println("请输入你的年龄");
        int age = myscanner.nextInt();//接受用户的输入
        System.out.println("请输入你的薪水");
        double sal = myscanner.nextDouble();//接受用户的输入
        System.out.println("name = " + name + "\n" +
                "年龄 = " + age + "\n" + "薪水" + sal);


    }
}
