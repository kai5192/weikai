package learncode.Chapter08.Homework04;

public class Manager extends Employee{
    private double grade;

    public Manager(String name, double salary, int work_date, double grade) {
        super(name, salary, work_date);
        this.grade = grade;
    }

    @Override
    public void print_salary() {
        System.out.print("经理\t"+getName());
        super.print_salary();
        System.out.print(1000+getWork_date()*getSalary()*grade+"\n");
    }

    public double getGrade() {
        return grade;
    }
}
