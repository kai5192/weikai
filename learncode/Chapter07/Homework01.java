package learncode.Chapter07;

public class Homework01 {
    public static void main(String[] args){
        //编写一个类，定义方法max,实现求某个double数组的最大值，
        // 并返回Homework01.java
        double[] doubles = {1.0,5.5,4.5,11.0};
        A01 a01 = new A01();
        double max = a01.max(doubles);
        System.out.println("数组的最大值为" + max);
    }
}
class A01{
    public double max(double[] doubles){
        double temp = doubles[0];
        for (int i = 0;i<doubles.length;i++){
            if(doubles[i] >temp){
                temp = doubles[i];
            }
        }return temp;
    }
}