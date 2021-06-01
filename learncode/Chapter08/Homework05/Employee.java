package learncode.Chapter08.Homework05;

public class Employee {
    //属性：工资，工作天数（共有）
    private int work_date;
    private double work_sakary;
    //方法:打印工资

    public Employee(int work_date, double work_sakary) {
        this.work_date = work_date;
        this.work_sakary = work_sakary;
    }

    public void out_salary(){

    }
    public int getWork_date() {
        return work_date;
    }

    public double getWork_sakary() {
        return work_sakary;
    }
}
