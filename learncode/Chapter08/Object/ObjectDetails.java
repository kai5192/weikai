package Chapter08.Object;

/**
 *  == 是一个比较运算符
 *  1. == ：既可以判断基本类型，又可以判断引用类型
 *  2. == ：如果判断基本类型，判断的是值是否相等。
 *          示例： int i = 10;double d = 10.0
 *  3. ==:如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象
 *  4. equals:是Object类中的方法，只能判断引用类型
 *  5.默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等
 *  例如 Integer,String
 */
public class ObjectDetails {
    public static void main(String[] args) {

        AA a = new AA();
        AA b = a;
        AA c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        BB bObj = a;
        System.out.println(bObj == c);//true
        int num1 = 10;

        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等
    }
}
class AA extends BB{};
class BB  {};