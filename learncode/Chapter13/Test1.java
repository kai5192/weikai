package learncode.Chapter13;

public class Test1 {
    String str = new String("hsp");
    final  char[] ch = {'j','a','v','a'};
    public void change(String str ,char ch[]){
        str = "java";//重点,str为final，所以一旦重新定义，就会重新指向（栈中的str）,原本指向的不会变化。第471个视频
//        this.str = "java";//此处修改了堆中str的指向
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);
    }
}