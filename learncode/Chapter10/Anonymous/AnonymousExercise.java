package learncode.Chapter10.Anonymous;

public class AnonymousExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        /*
        等价与：
        class AnonymousExercise$1 implenments Bell{
            @Override
                public void ring() {
                    System.out.println("懒猪起床了");
                }
            }
        cellPhone.alarmclock(new AnonymousExercise$1);//其中涉及动态绑定机制
        //编译类型为Bell 运行类型为：AnonymousExercise$1
         */
        cellPhone.alarmclock(new Bell() {//创建匿名内部类时直接作为形参
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell{
    void ring();//抽象方法
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}