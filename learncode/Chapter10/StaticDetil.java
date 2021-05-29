package learncode.Chapter10;
//静态代码块，方法，普通代码块方法与构造器的调用顺序
public class StaticDetil {
    public static void main(String[] args) {
//        new A(5);
        System.out.println(A.h);
    }

}
class A{
    static {
        System.out.println("静态代码块正在被调用");
    }
    {
        System.out.println("动态代码块正在被调用");
    }
    public int g = 1;
    public static int h = A.aaa();
    public A(int g) {
        System.out.println("构造器正在被调用");
        this.g = g;
    }
    public static int aaa(){
        System.out.println("静态方法正在被调用");
        return 1;
    }

}