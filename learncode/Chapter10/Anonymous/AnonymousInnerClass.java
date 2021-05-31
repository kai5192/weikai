package learncode.Chapter10.Anonymous;

/**
 *演绎基于接口的和基于类的匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Oter04 oter04 = new Oter04();
        oter04.method();
        oter04.method2();
        System.out.println("oter04.this代标的对象为："+oter04);
        System.out.println("与匿名内部类中的Oter04.this这个对象相同");
    }
}
class Oter04{
    private int n1 = 10;//属性
    public void method(){
        //基于接口的匿名内部类
        //老韩解读
        //1.需求： 想使用 IA 接口,并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.老韩需求是 Tiger/Dog 类只是使用一次，后面再不使用(重点)
        //4. 可以使用匿名内部类来简化开发
        //5. tiger 的编译类型 ? IA
        //6. tiger 的运行类型 ? 就是匿名内部类 Outer04$1
        /*
        我们看底层 会分配 类名 Outer04$
        class Outer04$1 implements IA {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        }
         */
        //7. jdk 底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1 实例，并且把地址
        // 返回给 tiger
        //8. 匿名内部类使用一次，就不能再使用
        //但是tiger这个对象可以一直使用
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎在叫...");
            }
        };//分号不能忘记
        System.out.println("tiger对象的运行类型"+tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();
    }
    public void method2(){//方法
        int n1 = 22;
        //1.基于类的匿名内部类
        //2.father的编译类型为Father
        //3.father的运行类型为Outer04$2（新生成的匿名内部类）
        /*
        clss Outer04$2 extends Father{
        @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        }
         */
        //4.如果该类为抽象类，则必须重写抽象方法
        System.out.println("---------------使用方法一-----------------");
        Father dali = new Father("dali"){
            int n1 = 22;
            @Override
            public void test() {
                //内部类属性与外部类属性重名时，内部类属性直接访问
                System.out.println("内部类属性与外部类属性重名时，内部类属性直接访问(n1): "+n1);
                //内部类属性与外部类属性重名时，外部类属性直接访问'Oter04.this.n1',其中Oter04.this代标一个对象:主方法的oter04
                System.out.println("Oter04.this代标的对象为："+Oter04.this);
                System.out.println("内部类属性与外部类属性重名时，外部类属性直接访问(Oter04.this.n1): "+Oter04.this.n1);
                System.out.println("匿名内部类重写了test方法(1)");
            }
        };
        dali.test();
        dali.test();//在方法内部可以多次调用
        System.out.println("dali对象的运行类型"+dali.getClass());
        System.out.println("---------------使用方法二-----------------");
        new Father("xiaozhang"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法(2)");
            }
        }.test();//不赋值就直接调用，但是只能调用一次
    }
}
interface IA{
    public void cry();//接口的抽象对象
}
//class Tiger implements IA {
//
// @Override
// public void cry() {
// System.out.println("老虎叫唤...");
// }
//}
//class Dog implements IA{
// @Override
// public void cry() {
// System.out.println("小狗汪汪...");
// }
//}
class Father{
    public String name;

    public Father(String name) {
        this.name = name;
    }
    public void test(){
        System.out.println("Father类");
    }
}
