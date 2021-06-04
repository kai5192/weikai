package learncode.Chapter11;

public class AAA {
    private String name = "小立";
    public void f(){
        class BBB{
            private String name;
            private BBB(String name) {
                this.name = name;
            }
            public void show(){
                System.out.println("内部类变量为"+this.name);
                System.out.println("外部类变量为"+AAA.this.name);
            }
        }
        BBB bbb = new BBB("小张");
        bbb.show();

    }
}
class TestAAA{
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.f();
    }
}