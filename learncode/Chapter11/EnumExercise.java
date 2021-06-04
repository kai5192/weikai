package learncode.Chapter11;

public class EnumExercise {
    /*
    （1）声明Week枚举类，其中包含星期一至星期日的定义，
    （2）使用values返回所有的枚举数组，并遍历，输出
     */
    public static void main(String[] args) {
        //获取到所有的枚举对象， 即数组
        Week[] weeks= Week.values();
        System.out.println("===========星期所有信息如下====================");
        //遍历，使用增强 for
        for(Week week:weeks){
            System.out.println("\t\t\t"+week.toString());
        }
    }
}
enum Week{
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日"),ZERO;//调用无参构造器可以省略括号，但是必须定义无参构造器
    private String name;

    Week(String name) {
        this.name = name;
    }

    Week() {
    }
    @Override
    public String toString() {
        return name;
    }
}