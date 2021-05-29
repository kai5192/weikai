package ProgramExercise.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类完成零钱通的各个功能
 * 将各个功能对应一个方法
 */
public class Oop {
    //化繁为简
    //1.先显示菜单
    //2.完成零钱通明细
    String details = "------------------消费明细-------------------";
    boolean bool = true;
    //3.完成收益入账
    Scanner scanner = new Scanner(System.in);
    double money = 0;
    double balance = 0;
    Date date = null;//表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //4.消费
    String note = "";//消费说明

    //5.优化退出
    //6.对收益和消费进行判断：找出不正确的金额条件找出来，然后给出提示
    //先完成主菜单
    public void mainMune() {
        do {
            System.out.println("------------------零钱通菜单OOP-------------------");
            System.out.println("\t\t\t\t1.零钱通明细");
            System.out.println("\t\t\t\t2.收益到账");
            System.out.println("\t\t\t\t3.消费");
            System.out.println("\t\t\t\t4.退   出");
            System.out.println("请选择（1-4）");
            Scanner scanner = new Scanner(System.in);
            int key = scanner.nextInt();
            //switch 分支控制
            switch (key) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (bool);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益
    public void income() {
        System.out.println("2.收益到账的金额：");
        money = scanner.nextDouble();
        //money需要校验，收益入账金额范围需要大于0
        if (money <= 0) {
            return;
        }
        balance += money;
        details += "\n收益入账\t+" + money;
        date = new Date();//打印当前日期
        details += money + "\t" + sdf.format(date) + "\t余额\t" + balance;
        return;
    }

    //消费
    public void pay() {
        System.out.println("3.消费的金额为：");
        money = scanner.nextDouble();
        //money需要校验
        if (money <= 0 || balance < money) {
            System.out.println("您的消费金额应该在0-" + balance);
            return;
        }
        balance -= money;
        System.out.println("请输入消费原因");
        note += scanner.next();//记录消费细节
        date = new Date();//打印当前日期
        details += "\n" + note + "\t" + money + "\t" + sdf.format(date) + "\t余额\t" + balance;
        return;
    }

    public void exit() {
        String snswer = "";
        do {
            System.out.println("你是否要退出？ yes/no");
            snswer = scanner.next();
            if ("yes".equals(snswer) || "no".equals(snswer)) {
                break;
            } else {
                System.out.println("输入有误");
            }
        } while (true);
        if (snswer.equals("yes")) {
            System.out.println("4.退出");
            bool = false;
            return;
        } else {
            return;
        }


    }
}
