package learncode.Chapter08.Polyparameter;

//普通员工继承了员工
public class Woker extends Employee {
    public Woker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public String work(){
        return getName() + "正在工作中";
    }
}
