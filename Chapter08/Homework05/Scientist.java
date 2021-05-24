package Chapter08.Homework05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(int work_date, double work_sakary, double bonus) {
        super(work_date, work_sakary);
        this.bonus = bonus;
    }

    @Override
    public void out_salary() {
        System.out.println("科学家的工资为："+getWork_sakary()*getWork_date()*12+bonus);
    }

    public double getBonus() {
        return bonus;
    }
}
