package Chapter08.Override;
//继承Person类，增加id\score属性/private,以及构造器
//say方法
public class Students extends Person{
    private int id;
    private double score;

    public int getId() {
        return id;
    }

    //say方法重写
    public String say(){
        return super.say()+"ID为："+id+"成绩为"+score;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Students(String name, int age, int id, double score) {
        super(name, age);//
        this.id = id;
        this.score = score;

    }
}
