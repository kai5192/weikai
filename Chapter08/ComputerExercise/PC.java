package Chapter08.ComputerExercise;

//编写PC子类，继承Computer类，添加特有属性
//打印信息
public class PC extends ComputerExercise {
    private String brand;

    //这里IDEA，根据继承的规则，自动把构造器调写好
    //体现出：继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("品牌为:" + brand + getdetails());
    }
}
