package Chapter05;

public class Multitable {
    public static void main(String[] args){
        //编写九九乘法表
        for(int i = 1;i < 10;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i + "×" + j + "=" + (i*j) + "\t");
            }System.out.print("\n");
        }
    }
}
