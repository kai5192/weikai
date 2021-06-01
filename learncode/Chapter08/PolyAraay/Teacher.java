package learncode.Chapter08.PolyAraay;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师"+super.say()+"薪水： "+salary;
    }

    public String teach(){
        return "老师"+getName() +"正在讲课...";
    }

    public double getSalary() {
        return salary;
    }
}
