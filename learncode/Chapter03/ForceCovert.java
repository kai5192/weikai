package learncode.Chapter03;

public class ForceCovert {
    //编写一个main方法
    public static void main(String[] args){
        //演示强制转换类型
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1,造成精度损失

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//造成 数据溢出

        //强制转换的细节
        //细节1：当数据从大到小时，就需要强制转换
        //细节2：强制转换只对最近的操作有效，往往会使用小括号提升优先级
        //int x = (int)10*3.5 + 6*1.5;编译错误 ： double => int
        int x = (int)(10*3.5 + 6*1.5);
        System.out.println(x);//44
        //细节3：char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char c1 = 100;//ok
        int m = 100;//ok
        //char c2 = m;//错误
        char c3 = (char)m;//ok
        System.out.println(c3);//100对应的字符
    }
}
