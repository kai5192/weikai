package learncode.Chapter07;

import java.util.Random;

public class Homework08 {
    //猜拳  0：石头；1：剪刀，2：布
    public static void main(String[] args){
        Tom tom = new Tom();
        tom.caiquan(0);
    }
}
class Tom{
    int j ;
    public Tom(){
        Random random = new Random();
        this.j = random.nextInt(3);
    }
    public void caiquan(int n){
    if((n == 1 & j == 2)||(n == 2 & j == 0)||(n == 0 & j == 1)){
        System.out.println("你赢了");
        System.out.println("你出的是"+ n +"电脑的是"+j);
    }else if((n == 2 & j == 1)||(n == 0 & j == 2)||(n == 1 & j == 0)){
        System.out.println("你输了");
        System.out.println("你出的是"+ n +"电脑的是"+j);
    }else if(n == j){
        System.out.println("平局");
    }
    }
}