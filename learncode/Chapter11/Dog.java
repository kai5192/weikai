package learncode.Chapter11;

abstract class Animal {
    public abstract void shout();
}
class Dog extends Animal  {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class AnimalTest{
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.shout();
        cat.shout();
    }
}