package learncode.Chapter13;

public class Integer01 {
    public static void main(String[] args) {
        //演示int <-->Integer的装箱和拆箱
        //jdk5前是手动装箱和拆箱
        //手动装箱（int -->Integer）的两种方式：
        int n1 =100;
        Integer integer = new Integer(n1);
        Integer integer1= Integer.valueOf(n1);

        //手动拆箱（int <--Integer）
        int i = integer.intValue();

        //jdk5后的自动装拆箱
        int n2 = 5;
        Integer integer2 = n2;//装
        int n3 = integer2;//拆
    }
}
