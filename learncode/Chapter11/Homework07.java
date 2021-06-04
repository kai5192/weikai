package learncode.Chapter11;

public class Homework07 {
    public static void main(String[] args) {
        new Car(15).air.flow();
        new Car(-4).air.flow();
        new Car(45).air.flow();

    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        void flow(){
            if(Car.this.temperature > 40){
                System.out.println("温度太高，来点冷气把");
            }else if(Car.this.temperature < 0){
                System.out.println("温度太低，来点暖气把");
            }else {
                System.out.println("温度很合适，关闭空调");
            }
        }
    }
    public Air air = new Air();
}
