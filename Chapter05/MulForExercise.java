package Chapter05;
import java.util.Scanner;
public class MulForExercise {
    public static void main(String[] args){
        //统计3个班的成绩，每个班有五名学生，并统计各个班的平均分以及所有学生的平均生与三个班及格人数
        //第一层三个班，
        //第二层五名学生，并没个班的平均分
        int numclass = 3;//班级的个数
        int sumclass = 5;//一个班的人数
        Scanner scanner = new Scanner(System.in);
        double sum_score = 0;//统计总成绩
        int sumperson = 0;
        for(int i = 1;i <= numclass;i++){
            double class_score = 0;//统计班级总成绩
            for (int j = 1;j <= sumclass;j++){System.out.println("请输入第"+i+"班"+j+"个学生的成绩");
                double score = scanner.nextDouble();
                if(score>=60){
                    sumperson++;
                }//第三层
                class_score += score;
            }System.out.println(i+"班的平均分为" + (class_score/sumclass));
                 //第二层
        sum_score += class_score;
        }//第一层结束
            System.out.println("总的平均成绩为" + (sum_score/numclass));
            System.out.println("及格人数为"+ sumperson);

    }
}
