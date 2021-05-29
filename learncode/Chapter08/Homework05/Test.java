package Chapter08.Homework05;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker(30, 200);
        Teacher teacher = new Teacher(22, 200, 8, 500);
        Scientist scientist = new Scientist(22, 500, 50000);
        worker.out_salary();
        teacher.out_salary();
        scientist.out_salary();
    }
}
