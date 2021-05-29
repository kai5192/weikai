package Chapter08.Homework05;

public class Worker extends Employee {
    public Worker(int work_date, double work_sakary) {
        super(work_date, work_sakary);
    }

    @Override
    public void out_salary() {
        System.out.println("工人的工资为："+getWork_sakary()*getWork_date()*12);
    }
}
