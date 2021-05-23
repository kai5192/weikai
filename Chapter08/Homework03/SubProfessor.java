package Chapter08.Homework03;

public class SubProfessor extends Professor {
    public SubProfessor(String name, int age, String job, double salary) {
        super(name, age, job, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是一个副教授");
        super.introduce();
    }
}
