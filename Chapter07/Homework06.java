package Chapter07;

public class Homework06 {
    public static void main(String[] args){
        //创建一个Cale类，在其定义2个变量表示两个操作数
        //定义四个方法实现求和，差，商（要求除数为0的话要提示）
        //并创建两个对象分别测试
        Cale cale1 = new Cale(5,10);
        Cale cale2 = new Cale(5,0);
        cale1.add(cale1);
        cale1.subtract(cale1);
        cale1.mutiply(cale1);
        cale1.divide(cale1);
        cale2.divide(cale2);
    }
}
class Cale{
    double doubles01;
    double doubles02;
    public Cale(double doubles01,double doubles02){
        this.doubles01 = doubles01;
        this.doubles02 = doubles02;
    }public void add(Cale cale){
        System.out.println("两数的和为："+(cale.doubles01 + cale.doubles02));
    }public void subtract(Cale cale) {
        System.out.println("两数相减为：" + (cale.doubles01 - cale.doubles02));
    }public void mutiply(Cale cale) {
        System.out.println("两数相乘为：" + (cale.doubles01 * cale.doubles02));
    }public void divide(Cale cale) {
        if(cale.doubles02 == 0){
            System.out.println("分母不可以为0");
        }else {
            System.out.println("两数相除为：" + (cale.doubles01 / cale.doubles02));
        }
    }
}
