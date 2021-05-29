package learncode.Chapter05;

public class Homework08 {
    public static void main(String[] args){
        //求出1-1/2+1/3-1/4....1/100
        double count = 0;
        for (int i = 1;i<=100;i++){
            if(i % 2 == 0){
                count -= 1.0/i;//1.0是重点
        }else {
            count += 1.0/ i;
        }
        }System.out.println("它们的和为："+count);
    }
}
