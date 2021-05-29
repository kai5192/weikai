package Chapter07;

public class Method01 {
        public static void main(String[] args){
            Person person1 = new Person();
            person1.speak();
            person1.cal01();
            int sum_x = 5;
            //调用有返回值的方法需要有一个变量接着这个值
            int num_cal02 = person1.cal02(sum_x);
            System.out.println(sum_x + "到1的和为"+num_cal02);
            int a = 5,b = 10;
            int returnsum = person1.getsum(a,b);
            System.out.println(a + "加" + b + "的和为"+ returnsum);
        }
}
class Person{
    //void 表示输出为空
    //不要忘记小括号
    //speak 为方法名
    public void speak(){
        System.out.println("你是一个好人！");
    }
    public void cal01(){
        int res = 0;
        for(int i = 0;i<=1000;i++){
            res +=i;
        }System.out.println("1到1000的和为" + res);
    }//此处的int替换 void表示输出整型
    public int cal02(int n){
        int res = 0;
        for(int i = 0;i<=n;i++){
            res +=i;
        }return res;
    }public int getsum(int m,int n){
        int res = m + n ;
        return res;
    }
}