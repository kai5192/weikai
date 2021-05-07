package Chapter04;
public class Homework {
    public static void main(String[] args){
         int x1 = 10 / 3;
         int x2 = 10 / 5;
         double x3 = -10.5 % 3;
        System.out.println("-------------------------作业一-------------------------------------");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        int i= 66;
        System.out.println("-------------------------作业二-------------------------------------");
        System.out.println(++i+i);// i = i +1 , temp = i, i = temp , 67+67
        /*
        int num1 = (int)"18";//错误 应该用Integer.parselInt("18");
        int num2 = 18.0 ;//错 double > int
        double num3 = 3d; // ok
        double num = 8; // ok
        int i1 = 48; char ch = i1 +1; //错 int > char
        byte b = 19; short s = b+ 2; // int > short

         */
        String str = "18.8";
        double d1 = Double.parseDouble(str);
        char c1 = '韩';
        String str2 = c1 +"";
        System.out.println("-------------------------作业四-------------------------------------");
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(str2);
    }
}
