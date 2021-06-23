package ProgramExercise.OrderSystem;

public class Fish extends Foods{
    private String[] taste;
    private int price;

    public Fish(String name, String[] taste,int price) {
        super(name);
        this.taste = taste;
        this.price = price;
    }

    @Override
    public void showDetail() {
        System.out.println("鱼类");
        System.out.print(getName());
        System.out.print("(");
        for (int i = 0; i < taste.length; i++) {
            System.out.print(taste[i]);
        }
        System.out.print(")");
        System.out.print("\t"+price+"元");
    }
}
