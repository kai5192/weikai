package learncode.Chapter10;

public abstract class Jober {
    public abstract void job();
    public void caculate(){

        //得到开始时间
        long start = System.currentTimeMillis();
        job();//涉及到动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行时间"+(end - start));
    }

}
