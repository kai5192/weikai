package learncode.Chapter07;

public class Homework07 {
    public static void main(String[] args){
    Dog1 dog1 = new Dog1("大黑","白色",5);
    dog1.show1(dog1);
    }
}
class Dog1{
    String name;
    String color;
    int age;
    public Dog1(String name,String color,int age){
        this.age = age;
        this.color = color;
        this.name = name;
    }
    public void show1(Dog1 dog1){
        System.out.println("这只狗的颜色为：" + dog1.color);
        System.out.println("这只狗的名字为：" + dog1.name);
        System.out.println("这只狗的年纪为：" + dog1.age);
    }
}