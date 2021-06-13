package learncode.Chapter13;

public class WratterVSString {
    public static void main(String[] args) {
        //包装类-->String
        Integer i = 100;//自动装箱
        //方式一
        String str1 = i + "";
        //方式二
        String str2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);
        //String -->包装类
        String str4 = "123";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);

    }
}
