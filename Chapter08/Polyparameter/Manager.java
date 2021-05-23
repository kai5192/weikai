package Chapter08.Polyparameter;
//经理多了奖金bonus属性和管理manage方法
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public String manage(){
        return getName()+"正在管理员工...";
    }

    public double getBonus() {
        return bonus;
    }
}
