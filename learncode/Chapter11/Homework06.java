package learncode.Chapter11;

public class Homework06 {
    public static void main(String[] args) {
        Person tangsheng = new Person("唐僧",new Plane());
        tangsheng.passHuoShan();
        tangsheng.common();
        tangsheng.passRiver();
    }
}
interface Vehicle{
    void work();
}
class Horse implements Vehicle{
    @Override
    public void work() {
        System.out.println("一般情况，马在工作...");
    }
}
class Boat implements Vehicle{
    @Override
    public void work() {
        System.out.println("过河，船在工作...");
    }
}
class Plane implements Vehicle{
    @Override
    public void work() {
        System.out.println("过火焰山，飞机在工作...");
    }
}
class VehicleFactory{
    //工厂类使用静态方法创建对象比较方便
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
    //唐僧一直用的是一匹马
    public static Horse horse = VehicleFactory.getHorse();
}
class Person{
    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
    //通常情况下用马，过河用船
    public void passRiver(){
        //如何利用vehicle参数
        //如果不是马或者马的子类，直接把马给它
        if(!(vehicle instanceof Boat)){
            System.out.print("没有船，给你船。 ");
            vehicle = VehicleFactory.getBoat();
        }
        vehicle.work();
    }
    public void common(){
        if(!(vehicle instanceof Horse)){
            System.out.print("没有马给你马。 ");
            vehicle = VehicleFactory.horse;
        }
        vehicle.work();
    }
    public void passHuoShan(){
        if(!(vehicle instanceof Plane)){
            System.out.print("没有飞机给你飞机。 ");
            vehicle = VehicleFactory.getPlane();
        }
        vehicle.work();
    }
}