package learncode.Chapter12;

public class Homework01 {
    public static void main(String[] args) {
        try {
            if(args.length!=2) {
                throw new ArrayIndexOutOfBoundsException("参数不对");
            }
                //把接受的数转换为整数
                int n3 = Integer.parseInt(args[0]);
                int n4 = Integer.parseInt(args[1]);
                double n5 = A.cal(n3,n4);
                System.out.println(n5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        }catch (ArithmeticException e){
            System.out.println("出现除0的异常");
        }
    }
}
class A{
    public static double cal(int n1 ,int n2){
        return (double) n1/n2;
    }
}