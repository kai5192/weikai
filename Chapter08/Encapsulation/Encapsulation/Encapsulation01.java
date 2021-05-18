package Chapter08.Encapsulation.Encapsulation;

public class Encapsulation01 {
    public static void main(String[] args){
        Person person = new Person();
        person.setAge(1000);
        person.setName("jack");
        String string1 = person.getName();
        System.out.println(string1);
    }

}
class Person{
    public String name ;//名字公开
    private int age;// age私有化
    private double salary;//salary私有化

    //用快捷键写setXxx和gttXxx  alt+ins


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>=1 && age<=210){
            this.age = age;
        }else {
            System.out.println("年龄需要在1-120");
        }

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }//写一个方法返回属性信息
    public String info(){
        return "名字="+name+"年龄"+age+"薪水"+salary;
    }
}