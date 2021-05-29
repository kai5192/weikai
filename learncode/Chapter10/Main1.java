package learncode.Chapter10;

public class Main1 {
    public static void main(String[] args) {
        //在上方动态传递参数，具体看笔记
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
