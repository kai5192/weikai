package Chapter05;

public class Homework09 {
    public static void main(String[] args){
        //求1+（1+2）+（1+2+9）+....+（1+2+...+100）
        int sum = 0;
        for(int i = 1;i <=100;i++){
            for (int j=1;j<=i;j++){
                sum += j;
            }
        }System.out.println(sum);
    }
}
