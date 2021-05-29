package learncode.Chapter10.Interface;

public class Computer {
    //编写一个方法，计算机工作
    //通过接口调用方法
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.end();
    }
}
