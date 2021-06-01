package learncode.Chapter08.PolyAraay;

public class Students extends Person {
    private double score;

    public Students(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return "学生" + super.say() + "成绩： " + score ;
    }

    public String study(){
        return "学生"+getName()+"正在学习java...";
    }

    public double getScore() {
        return score;
    }
}
