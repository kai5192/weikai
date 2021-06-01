package learncode.Chapter08.Homework10;

import java.util.Objects;

/**
 * 编写一个类（5个对象），并重写父类（Obijct）的equals方法
 * 判断两个对象的五个参数是否相等
 */
public class Docter {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Docter(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docter docter = (Docter) o;
        return age == docter.age && gender == docter.gender && Double.compare(docter.salary, salary) == 0 && Objects.equals(name, docter.name) && Objects.equals(job, docter.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, gender, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
