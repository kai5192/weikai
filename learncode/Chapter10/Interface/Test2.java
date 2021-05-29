package learncode.Chapter10.Interface;

public class Test2 {
    public static void main(String[] args) {
        UsbInterface[] usbInterfaces = new UsbInterface[2];
        Phone phone = new Phone();
        Camera camera = new Camera();
        usbInterfaces[0] = phone;
        usbInterfaces[1] = camera;
        for (int i = 0; i < usbInterfaces.length; i++) {
            usbInterfaces[i].start();
            if (usbInterfaces[i] instanceof Phone){
                ((Phone) usbInterfaces[i]).call();
            }
            usbInterfaces[i].end();
            System.out.println("--------------");
        }

    }
}
