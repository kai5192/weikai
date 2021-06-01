package learncode.Chapter08.Homework11;

public class Students extends Person{
    public int g = 1;
    private int h = 1;

    public void study() {
        System.out.println("子类在运行study");
    }

    @Override
    public void run() {
        System.out.println("子类在运行run");
    }

//    public int getH() {
//        return h;
//    }
}
