package learncode.Chapter0102;

public class ChangeChar {
    public static void main(String[] args) {
        //   \t:一个制表符，实现对齐功能
        System.out.println("北京\t天津\t上海");
        //   \n:换行符
        System.out.println("jack\nsmith\nmary");
        //   \\:第一\表示转译，输出\
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        //   \":第一个\表示转移，输出‘
        System.out.println("老韩说：\"要好好学习java,有前途 \"");
        //   \':一个’
        System.out.println("老韩说：\'要好好学习java,有前途\'");
        //   \r:一个回车  System.out.println("韩顺平教育\r北京");
        //   解读
        //   1. 输出  韩顺平教育
        //   2.\r表示 ： 回车,回到首行
        //   3.输出：北京平教育
        System.out.println("韩顺平教育\r北京");
        //   \r\n: 回车加换行
        System.out.println("韩顺平教育\r\n北京");
    }

    public static class Task2 {

    }

    public static class Task1 {
        public static void main(String[] args) {
            System.out.println("我 is studying java!");
        }
    }
}
