package learncode.Chapter10;
//懒汉式单例模式
public class Single2 {
    public static void main(String[] args) {
        System.out.println(Cat.g);
        Cat.getInstance();
    }
}

//在程序运行过程中只能创建一个Cat对象
//使用单例模式
class Cat{
    private String name;
    public static int g = 1;
    private static Cat cat;

    //1.仍将构造器私有化
    //2.定义一个私有化属性对象
    //3.提供一个public方法，可以返回一个Cat对象
    private Cat(String name) {
        System.out.println("构造器正在被调用...");
        this.name = name;
    }
    public static Cat getInstance(){
     if(cat == null){
         cat = new Cat("小可");
        }
     return cat;
    }


}
