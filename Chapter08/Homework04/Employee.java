package Chapter08.Homework04;

public class Employee {
    private String name;
    private double salary;
    private int work_date;//工作天数

    public Employee(String name, double salary, int work_date) {
        this.name = name;
        this.salary = salary;
        this.work_date = work_date;
    }

    public void print_salary(){
        System.out.print("工资为:\t");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWork_date() {
        return work_date;
    }
}
