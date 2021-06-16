package learncode.Chapter13;

import java.util.Scanner;

public class StringBufferExercise {
    /*
    输入商品名和价格名，要求打印效果示例
    商品名 商品价格
    手机  123,234.59
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名");
        String name = scanner.next();
        System.out.println("请输入价格");
        String price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        for (int i = price.lastIndexOf(".")-3; i > 0; i-=3) {
           stringBuffer = stringBuffer.insert(i,",");
        }
        System.out.println(name+"\t"+stringBuffer);
    }
}
