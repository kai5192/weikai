package Chapter08.Super;

public class B extends A{
    //访问父类的属性，但不能访问父类private属性
    //案例super.属性名
    public void hi(){
        //n4不能访问
        System.out.println(super.n1+" "+super.n2+""+super.n3);
    }

    //访问父类的方法，但不能访问私有方法
    //案例：super.方法名（参数列表）；
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
        //不能访问suer.test400();
    }
    //访问父类构造器：super(参数列表)；只能方在第一句；

    public B(String name, int age) {
        super(name, age);
    }
}
