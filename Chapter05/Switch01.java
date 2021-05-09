package Chapter05;
import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）");
        char c1= myscanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b':
                System.out.println("今天星期二");
            default:
                System.out.println("内容不匹配");
        }
    }

}
