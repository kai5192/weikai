package learncode.Chapter13;

public class String02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hhhhh";
        String string = new String("hhhhh");
        Person p2 = new Person();
        p2.name = "hhhhh";
        System.out.println(p1.name.equals(p2.name));//比较的是值T
        System.out.println(p1.name.intern() == string.intern());//返回的是堆中的指引T
        System.out.println(p1.name == "hhhhh");

    }
}
class Person{
    String name;
}