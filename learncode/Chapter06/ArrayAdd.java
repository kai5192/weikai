package learncode.Chapter06;
import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[] args){
        //给数组添加一个数；直接加到最后方
        int[] array1= {1,2,3};
        while (true) {
            System.out.println("\n"+"你是否要添加整数呢 y/n");
            Scanner scanner = new Scanner(System.in);
            //int[] array2 = new int[array1.length + 1];
            int[] array2;
            char answer = scanner.next().charAt(0);
            if (answer == 'y') {
                array2 = new int[array1.length + 1];
                System.out.println("你想输入啥？");
                int answer2 = scanner.nextInt();
                for (int i = 0; i < array1.length; i++) {
                    array2[i] = array1[i];
                }
                array2[array2.length - 1] = answer2;
                array1 = array2;

            }else {
                break;
            }
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j]);
            }

        }
    }
}
