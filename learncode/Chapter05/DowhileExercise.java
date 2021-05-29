package learncode.Chapter05;
import java.util.Scanner;
public class DowhileExercise {
    public static void main(String[] args){
        //如果李三不还钱，则老韩将一直使出五连鞭，知道李三说还钱为止
        Scanner scanner = new Scanner(System.in);
        char answer1 = ' ';
        do{
            System.out.println("你还钱吗还钱？yes/no");
            System.out.println("老韩使出五连鞭");
            answer1 = scanner.next().charAt(0);

        }while(answer1 != 'y');

    }
}
