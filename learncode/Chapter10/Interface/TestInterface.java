package learncode.Chapter10.Interface;

public class TestInterface {
    public static void main(String[] args) {
        //创建手机相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }

}
