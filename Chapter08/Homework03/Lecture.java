package Chapter08.Homework03;

public class Lecture extends Professor{
    public Lecture(String name, int age, String job, double salary) {
        super(name, age, job, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是一个讲师");
        super.introduce();
    }
}
