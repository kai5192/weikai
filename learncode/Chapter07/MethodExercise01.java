package learncode.Chapter07;

public class MethodExercise01 {
    public static void main(String[] args){
     Exercise exercise = new Exercise();
     if(exercise.isodd(2)){
         System.out.println("是奇数");
     }else {
         System.out.println("是偶数");
     }exercise.forprint(5,6,'*');
    }
}
class Exercise{
    public boolean isodd(int n){
        return n % 2 != 0;
    }
    public void forprint(int m,int n,char o){
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(o + "\t");
            }System.out.print("\n");
        }
    }
}