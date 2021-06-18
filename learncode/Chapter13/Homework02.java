package learncode.Chapter13;

import java.util.Scanner;

/*
要求输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功
否则生成异常对象
要求：
（1）用户名长度为2，3或4
（2）密码长度为6，要求全部为数字
（3）邮箱中包含@，并且@在.前面
 */
public class Homework02 {
    public static void main(String[] args) {
        try {
            Registration registration = new Registration();
            registration.register();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Registration {
    Scanner scanner = new Scanner(System.in);

    public void register() {
        System.out.println("请输入用户名，长度为2，3，4");
        String userName = scanner.next();
        if (testUserNumber(userName)) {
            System.out.println("请输入密码，要求格式为六位数字");
        } else {
            throw new RuntimeException("用户名格式不对");
        }
        String passWord = scanner.next();
        if (testPassWordNumber(passWord)) {
            System.out.println("请输入你的邮箱");
        } else {
            throw new RuntimeException("密码格式不对");
        }
        String email = scanner.next();
        if (testEmail(email)) {
            System.out.println("请输入你的邮箱");
        } else {
            throw new RuntimeException("邮箱格式不对");
        }
        System.out.println("注册成功");
    }

    public boolean testUser() {
        System.out.println("请输入用户名，长度为2，3，4");
        String userName = scanner.next();
        if (testUserNumber(userName)) {
            System.out.println("请输入密码，要求格式为六位数字");
            return true;
        } else {
            throw new RuntimeException("用户名格式不对");
        }
    }


    public boolean testUserNumber(String string) {
        return string.length() <= 4 && string.length() >= 2;
    }

    public boolean testPassWord() {
        String passWord = scanner.next();
        if (testPassWordNumber(passWord)) {
            System.out.println("请输入你的邮箱");
            return true;
        } else {
            throw new RuntimeException("密码格式不对");
        }
    }

    public boolean testPassWordNumber(String string) {
        return string.length() == 6 && isDigital(string);
    }

    public boolean isDigital(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean testEmail(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        if (stringBuffer.indexOf("@") >0 &&
                stringBuffer.indexOf("@") < stringBuffer.indexOf(".")) {
            return true;
        } else {
            return false;
        }
    }
}