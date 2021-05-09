package Chapter05;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        /*
        参加歌手比赛，如果初赛成绩大于8.0进入比赛
         */
        System.out.println("请输入你的性别");
        Scanner myscanner = new Scanner(System.in);
        char gender = myscanner.next().charAt(0);
        System.out.println("请输入你的成绩");
        double score = myscanner.nextDouble();
        if(score>0 & score<=10){
            if(score > 8.0){
                System.out.println("恭喜你进入决赛");
                if(gender == '男'){System.out.println("恭喜您进入男子组决赛");
                }else {System.out.println("恭喜您进入女子组决赛");}

            } else {
                System.out.println("很遗憾，你没有进入决赛");
                    }
        }else {
                System.out.println("您输入的格式不对");
            }

    }
}
