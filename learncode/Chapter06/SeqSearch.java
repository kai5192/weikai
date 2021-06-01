package learncode.Chapter06;
import java.util.Scanner;
public class SeqSearch {
    public static void main(String[] args){
         //有一个数组，判断你输入的是否在里面 如果是输出并告诉位置，
        // 如果没有说明里面没有
        String[] name_list = {"小名","张三","李四"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("你能猜到列表里都有谁吗");
        String name = scanner.next();
        int i = 0;
        for (;i< name_list.length;i++){
            if(name.equals(name_list[i])){
                System.out.println("恭喜你猜到了，它在第" + (i + 1)+"位");
                break;
            }
        }if(i == name_list.length){
            System.out.println("很遗憾，你猜错了");
        }
    }
}
