package Chapter08.Homework05;

public class Teacher extends Employee{
    //课时费与课时天数
    private int classDay;
    private double classSal;

    public Teacher(int work_date, double work_sakary, int classDay, double classSal) {
        super(work_date, work_sakary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public void out_salary() {
        System.out.println("老师的工资为："+getWork_sakary()*getWork_date()*12
        +getClassDay()*getClassSal());
    }

    public int getClassDay() {
        return classDay;
    }

    public double getClassSal() {
        return classSal;
    }
}
