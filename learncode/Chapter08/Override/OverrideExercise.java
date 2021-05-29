package Chapter08.Override;

public class OverrideExercise {
    public static void main(String[] args){
        Person jack = new Person("jack", 15);
        System.out.println(jack.say());
        Students jack1 = new Students("jack", 15, 222, 99.9);
        System.out.println(jack1.say());

    }
}
