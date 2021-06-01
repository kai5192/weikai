package learncode.Chapter08.Homework03;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher1", 50, "teacher1", 9999);
        Professor professor = new Professor("professor1", 66, "professor1", 10000);
        teacher.introduce();
        professor.introduce();

    }
}
