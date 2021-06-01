package learncode.Chapter04;

public class ArithmeticOperatorExercise02 {
    public static void main(String[] args){


        //1.需求:
        //假如还有 59 天放假，问：合 xx 个星期零 xx 天
        //2.思路分析
        //(1) 使用 int 变量 days 保存 天数
        //(2) 一个星期是 7 天 星期数 weeks： days / 7 零 xx 天 leftDays days % 7
        //(3) 输出
        //3.走代码
        int days = 555;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");
    }
}
