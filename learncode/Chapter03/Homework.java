package Chapter03;

public class Homework {
    public static void main(String[] args) {
        //作业1
        System.out.println("---------------------作业一---------------------------");
        int n1 =13;
        int n2 =17;
        int n3 = n1 +n2 ;
        System.out.println("n3=" + n3);//30
        int n4 = 38;
        int n5 =n4-n3;
        System.out.println("n5=" + n5);//8
        System.out.println("---------------------作业二---------------------------");

        //作业二：使用char类型，分别保存 \n \t \r \\ 1 2 3 等
        char c1 = '\n';//换行
        char c2 = '\t';//制表
        char c3= '\r';//回车
        char c4 = '\\';//输出"/"
        char c5 = '1';
        char c6 = '2';
        char c7= '3';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println("---------------------作业三---------------------------");

        //作业三：保存两本书名，用+号拼接，看效果
        //保存两个性别，用+拼接，看效果。保存两本书价格用加号拼接看效果
        String book1 = "天龙八部";
        String book2 = "笑傲江湖";
        System.out.println(book1 + book2);
        //性别用 char 保存
        char x1 = '男';
        char x2 = '女';
        System.out.println(x1 + x2); //输出一个整数
        //保存两本书价格
        double price1 = 123.11;
        double price2 = 100.11;
        System.out.println(price1 + price2);//两个数相加
        System.out.println("---------------------作业四---------------------------");

        //作业4
        /*
        姓名 年龄  成绩  性别   爱好
         xx   xx  xx    xx   xx
         */
        String name = "李华";
        int age = 20;
        double score = 20.9;
        char gender = '男';
        String hobby = "打篮球";
        System.out.println("姓名\t年龄\t成绩 \t性别\t爱好  " + "\n"+
                name + c2 +age+ c2 + score+ c2 + gender+ c2 + hobby);
    }
}
