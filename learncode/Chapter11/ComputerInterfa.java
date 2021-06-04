package learncode.Chapter11;

public interface ComputerInterfa {
    double work(double n1,double n2);
}
class CellPhone {

    public double testwork(ComputerInterfa computerInterfa, double n1,double n2) {
        double result = computerInterfa.work(n1,n2);
        System.out.println("计算结果为："+result);
        return result;
    }
}
class TestWork{
    public static void main(String[] args) {
        new CellPhone().testwork(new ComputerInterfa() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },15,20);
    }
}