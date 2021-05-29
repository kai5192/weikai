package learncode.Chapter10;

public class Employeer extends Jober{
    @Override
    public void job() {
        long num = 0;
        for (int i = 0; i < 100000; i++) {
            num++;
            num++;
        }
    }
}
