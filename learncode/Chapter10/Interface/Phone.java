package learncode.Chapter10.Interface;

public class Phone implements UsbInterface{//实现接口

    @Override
    public void start() {
        System.out.println("手机正在工作...");
    }

    @Override
    public void end() {
        System.out.println("手机结束工作...");
    }
    public void call(){
        System.out.println("我是手机的专属方法");
    }
}
