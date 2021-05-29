package Chapter08.Polyparameter;
/*
包含姓名和月工资，以及计算年工资getAnnual的方法
普通员工继承了员工，经理多了奖金bonus属性和管理manage方法
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return salary*12;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

