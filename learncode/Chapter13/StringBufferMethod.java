package learncode.Chapter13;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //增
        stringBuffer.append('l');
        System.out.println("加： "+stringBuffer);
        stringBuffer.append(7);
        System.out.println("加： "+stringBuffer);
        stringBuffer.append("haha");
        System.out.println("加： "+stringBuffer);
        //删
        stringBuffer.delete(0,1);
        System.out.println("删： "+stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println("删： "+stringBuffer);
        //改
        stringBuffer.replace(0,3,"张三丰");
        System.out.println("改： "+stringBuffer);
        //查
        int indexof = stringBuffer.indexOf("张三丰");
        System.out.println(indexof);
        //插
        stringBuffer.insert(1,"sssss");
        System.out.println("插： "+stringBuffer);
        // 长度
        System.out.println(stringBuffer.length());
    }
}
