package learncode.Chapter08.Homework03;

public class Teacher {
    private String name;
    private int age;
    private String job;
    private double salary;

    public Teacher(String name, int age, String job, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println(name+" job: "+job +" salary "+salary+" age "+age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }
}
