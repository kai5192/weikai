package Chapter08.Homework10;

public class Test {
    public static void main(String[] args) {
        Docter docter1 = new Docter("lili", 33, "老师", '男',999);
        Docter docter2 = new Docter("lil", 33, "老师", '男',999);
        System.out.println(docter1.equals(docter2));
    }
}
