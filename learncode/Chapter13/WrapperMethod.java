package learncode.Chapter13;
//Integer和Charater类的常用方法
public class WrapperMethod {
    public static void main(String[] args) {
        Integer integer = 5;
        System.out.println(Integer.MIN_VALUE);//返回最小值
        System.out.println(Integer.MAX_VALUE);//返回最大值
        //判断是否为数字
        System.out.println(Character.isDigit('J'));
        System.out.println(Character.isDigit(999));
        System.out.println(Character.isDigit('a'));//判断是不是数字
        System.out.println(Character.isLetter('a'));//判断是不是字母
        System.out.println(Character.isUpperCase('a'));//判断是不是大写
        System.out.println(Character.isLowerCase('a'));//判断是不是小写
        System.out.println(Character.isWhitespace('a'));//判断是不是空格
        System.out.println(Character.toUpperCase('a'));//转成大写
        System.out.println(Character.toLowerCase('A'));//转成小写

    }
}
