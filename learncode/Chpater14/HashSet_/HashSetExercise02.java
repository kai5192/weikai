package learncode.Chpater14.HashSet_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("llii",55,new MyDate(1,2,1)));
        hashSet.add(new Employee1("llss",55,new MyDate(1,2,1)));
        hashSet.add(new Employee1("llii",56,new MyDate(1,2,1)));
        System.out.println(hashSet.toString());

    }
}
class Employee1{
    private String name;
    private double sal;
    private  MyDate birth;

    public Employee1(String name, double sal, MyDate birth) {
        this.name = name;
        this.sal = sal;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birth, employee1.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birth=" + birth +
                '}';
    }
}
class MyDate{
    private int year;
    private int month;
    private  int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}