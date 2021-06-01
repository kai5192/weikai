package learncode.Chapter07;

public class MethodExercise {
    public static void main(String[] args){
        //编写一个方法copyPerson,可以复制一个独立的Person对象返回复制的对象；
        //注意要求得到新对象和原来的对象是独立的对象，只是他们的属性相同。
        Dog dog = new Dog();
        dog.age = 5;
        dog.name = "大黄";
        Dog copydog = (new  CopyDog()).copyDog(dog);
        System.out.println(dog.name);
        System.out.println(copydog.name);
        copydog.name = "大黑";
        System.out.println("修改一个之后：");
        System.out.println(dog.name);
        System.out.println(copydog.name);
    }
}
class Dog{
    int age;
    String name;
}
class CopyDog{
    public Dog copyDog(Dog dog){
        Dog dog1 = new Dog();
        dog1.name = dog.name;
        dog1.age = dog.age;
        return dog1;
    }
}