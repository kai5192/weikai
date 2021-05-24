package Chapter08.Homework04;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("老王", 300, 22, 1.5);
        Woker woker = new Woker("小李", 200, 22, 1.0);
        manager.print_salary();
        woker.print_salary();
    }
}
