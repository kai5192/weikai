package Chapter08.Object;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("smith", 9, '男');
        Person person1 = new Person("smith", 10, '男');
        System.out.println(person.equals(person1));

    }
}
