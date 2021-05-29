package Chapter08.Homework11;
//写出向上转型和向下转型方法
public class Test {
    public static void main(String[] args) {
        //向上转向
        Person p1 = new Students();
        p1.eat();//运行父类
        p1.run();//运行子类
        System.out.println(p1.getH());
        System.out.println(p1.g);
        Students p2 = (Students)p1;
        System.out.println(p2.getH());
        System.out.println(p2.g);

    }
}
