package learncode.Chapter13;
//Stringbuffer与String的相互转换
public class StringBuffer1 {
    public static void main(String[] args) {
        //String-->StringBuffer
        String str = "hello tom";
        //1.使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);
        //2.使用.append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);
        System.out.println(stringBuffer);

        //StringBuffer-->String
        StringBuffer stringBuffer2 = new StringBuffer("ssssssdd");
        //1.toString
        String str1 = stringBuffer2.toString();
        //2.使用构造器
        String str2 = new String(stringBuffer2);
    }
}
