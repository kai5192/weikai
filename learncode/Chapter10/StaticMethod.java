package learncode.Chapter10;
//创建一个学生类使用静态变量和静态方法记录学生交的学费的总量
//静态方法不能直接使用对象成员
public class StaticMethod {
    public static void main(String[] args) {
        //创建两个学生对象
        Stu stu1 = new Stu("stu1");
        Stu stu2 = new Stu("stu2");
        stu1.pay(1111);
        stu2.pay(222);
        Stu.show();

    }
}
class Stu{
    private String name;
    //静态变量记录学费总额
    public static double money = 0;
    public static int stuNum = 0;

    public Stu(String name) {
        this.name = name;
    }
    //静态方法
    public static void pay(double money){
        Stu.money += money;
        Stu.stuNum ++;
    }
    public static void show(){
        System.out.println("已交学费的学生人数为："+Stu.stuNum+" 总金额为： "+Stu.money);
    }
}
