package Chapter08.Homework04;

public class Woker extends Employee{
    private double grade;

    public Woker(String name, double salary, int work_date, double grade) {
        super(name, salary, work_date);
        this.grade = grade;
    }

    @Override
    public void print_salary() {
        System.out.print("员工\t"+getName());
        super.print_salary();
        System.out.print(getWork_date()*getSalary()*grade+"\n");
    }

    public double getGrade() {
        return grade;
    }
}
