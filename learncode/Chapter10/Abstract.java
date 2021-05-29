package learncode.Chapter10;
//1.有多个类，完成不同的任务job
//2.要求能狗得到各自完成任务的时间
//3.编程实现
public class Abstract {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.caculate();
        Employeer employeer = new Employeer();
        employeer.caculate();
    }



}
