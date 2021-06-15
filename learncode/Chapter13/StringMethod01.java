package learncode.Chapter13;

public class StringMethod01 {
    public static void main(String[] args) {
        //1. equals 前面已经讲过了. 比较内容是否相同，区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("1: "+str1.equals(str2));
        //2.equalsIgnoreCase忽略大小写的判断的判断内容是否相等
        System.out.println("2: "+str1.equalsIgnoreCase(str2));
        //3.length 获取字符的个数，字符串的长度
        System.out.println("3: "+"ninini".length());
        //4.indexof获取字符再字符串第一次出现的位置
        String str3 = "wer@jjjj@kkk";
        System.out.println("5: "+str3.indexOf('@'));
        //5.lastIndexOf获取字符在字符串最后一次出现的位置
        System.out.println("5: "+str3.lastIndexOf('@'));
        //6.substring截取指定范围的字串
        //从索引为3的开始截取
        System.out.println("6: "+str3.substring(3));
        //7.str3.substring(2,5)//表示截取从2到5-1的字符
        System.out.println("7: "+str3.substring(2,5));
    }
}
