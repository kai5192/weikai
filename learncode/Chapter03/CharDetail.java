package learncode.Chapter03;
//字符类型使用细节
/*  1. 字符常量是单引号（''）括起来的单个字符。(""表示字符串) 例如：
       char c1 = 'a' ；char c2 = '中' char c3 = '9'；
    2.  java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。
        例如：char c3 = '\n' ;
    3.  java中,char的本质是一个整数，在输出时，是unicode码对应的字符。
    4.  可以给char赋一个整数，然后输出时，会按照对应的unicode字符输出
    5.  char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode编码
 */


public class CharDetail {
    public static void  main(String[] args){
        //3.java中,char的本质是一个整数，在输出时，是unicode码对应的字符。
        char c1 = 97; //对应字母a
        System.out.println(c1);
        //4.也可以输出a 对应的数字
        char c2 = 'a';
        System.out.println((int)c2);
        //5.char类型是可以进行运算的
        System.out.println('a'+10);
    }
}
