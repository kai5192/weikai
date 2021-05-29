package learncode.Chapter10;

public class Manager extends Jober{
    //计算任务
    //1+...+100000
    //将公共的代码提出来
//    public void caculate(){
//
//        //得到开始时间
//        long start = System.currentTimeMillis();
//        job();
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间"+(start - end));
//    }
    public void job(){
        long num = 0;
        for (int i = 0; i < 100000; i++) {
            num++;
        }

    }
}
