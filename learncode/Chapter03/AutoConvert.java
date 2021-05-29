package Chapter03;

public class AutoConvert {
    //编写一个main方法
    public static void main(String[] arsgs) {
        //细节1：有很多类型的数据混合匀速时，
        //系统首先自动将所有数据换成容量最大的那种数据类型，然后再计算
        int n1 = 10; //ok
        //float d1 = n1 + 1.1;//错误 n1 + 1.1 => 结果类型为 double
        // double d1 = n1 + 1.1;//对 n1 + 1.1 => 结果类型为 double
        float d1 = n1 + 1.1F;//对 n1 + 1.1 => 结果类型为 float

        //细节2：当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，
        //就会报错，反之就会进行自动类型转换
        // int n2 = 1.1;//错误 double => int

        //细节3：(byte,short) 和 char 之间不回互相转换
        //当把具体数赋值给 byte 时,(1)先判断该数是否在byte范围内，如果是就可以
        byte b1 = 10; //对 [-128，127]
        // int n2 = 1; //n2是int
        //byte b2 = n2; //错误，原因：如果是变量赋值，判断类型
        //
        //char c1 = b1; //错误

        //细节4： byte,short,char 他们三者可以计算，在计算时首先转换为int
        //注： 无论是同类型还是不同类型，这三类只要参与计算都会转化为int
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        // short s2 = b2 +s1;//错，b2 + s1 => int
        int s2 = b2 +s1;//对，b2 + s1 => int
        //byte b4 = b2 + b3;// b2+b3 => int
        //

        //细节5：boolean 不参与转换
        boolean pass = true;
        //int  num1000 = pass //错，boolean 不参与转换

        //细节6：自动提升原则，表达式结果的类型自动提升为操作数中最大的类型
        //看一道题
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b4 +s3 +num200 +num200; //类型为double
    }
}
