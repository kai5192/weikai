package learncode.Chapter08.Override;

//编写一个Person类，包括属性/private(name,age)
//构造器，say方法：返回信息
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "名字为：" + name + "年龄为：" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
