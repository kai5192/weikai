package Chapter05;

public class Homework01 {
    public static void main(String[] args){
        /*
        某人有100 000元，每次经过一个路口，需要交费，规则如下：
        （1）现金大于50000时，每次交5%
        （2）现金小于等于50000时，每次交1000
        编程计算该人可以经过多少次路口，要求：使用while + break方式完成
        */
        int money = 100000;
        int i = 0;
        while(i >= 0){
            if(money > 50000 ){
              money *= 0.95;
            }else if (money>=1000){money -= 1000;
                }else{break;

            } i++;
        }System.out.println("该人可以经过" + i +"次路口" );
    }
}
