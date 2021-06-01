package learncode.Chapter07;

public class Homework05 {
    public static void main(String[] args){
        //定义一个圆类Circle,定义属性：半径，提供实现周长功能的方法
        //提供现实圆面积的方法
        A04 a04 = new A04(5);
        A004 a004 = new A004();
        a004.passobject(a04,3);
    }
}
class A04{
    double radious;
    public A04(double radious){
        this.radious = radious;
    }
    public void printarea(A04 a04){
        System.out.println("半径为" + a04.radious + "的圆的面积为" +
                Math.PI*a04.radious*a04.radious);
    }
    public void printperimeter(A04 a04){
        System.out.println("半径为" + a04.radious + "的圆的周长为" +
                Math.PI*a04.radious*2);
    }public void setRadious1(double radious){
        this.radious = radious;
    }
}
class A004{
    public void passobject(A04 a04,int times){
        for (int i = 0;i<= times;i++){
            a04.setRadious1(a04.radious - 1);
            a04.printarea(a04);
            a04.printperimeter(a04);
        }
    }
}