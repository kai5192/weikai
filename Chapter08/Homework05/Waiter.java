package Chapter08.Homework05;

public class Waiter extends Employee {
    public Waiter(int work_date, double work_sakary) {
        super(work_date, work_sakary);
    }

    @Override
    public void out_salary() {
        System.out.println("服务员的工资为："+getWork_sakary()*getWork_date()*12);
    }
}
