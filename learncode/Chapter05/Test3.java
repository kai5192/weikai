package learncode.Chapter05;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        //根据指定月份，打印该月份属于的季节
        System.out.println("请输入这是几月");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if(month>0 && month<=12){
            switch (month)  {
                case 3:
                case 4:
                case 5:
                    System.out.println("这是春季");
                    break;
                case 6:
                    System.out.println("这是夏季");
                case 7:
                case 8:
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("这是秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("这是冬季");
                    break;
            }
        }else{System.out.println("您输入的格式不对");}

    }
}
