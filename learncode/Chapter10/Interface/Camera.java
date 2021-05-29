package learncode.Chapter10.Interface;

public class Camera implements UsbInterface{//实现接口

    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void end() {
        System.out.println("相机结束工作");
    }
}
