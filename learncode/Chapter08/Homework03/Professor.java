package learncode.Chapter08.Homework03;

public class Professor extends Teacher{
    public Professor(String name, int age, String job, double salary) {
        super(name, age, job, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是一个教授");
        super.introduce();
    }
}
