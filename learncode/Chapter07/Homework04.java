package learncode.Chapter07;

public class Homework04 {
    public static void main(String[] args){
        //编写类A03，是西安数组的复制共嗯那个copyArr,输入旧数组，返回一个新数组
        //元素和新数组一样
        A03 a03 = new A03();
        int[] ints1 = {1,2,3,4};
        int[] ints2 = a03.copyArr(ints1);
        a03.printint(ints1);
        a03.printint(ints2);
    }
}
class A03{
    public int[] copyArr(int[] ints){
        int[] temp = new int[ints.length ];
        for (int i = 0;i < ints.length;i++){
            temp[i] = ints[i];
        }return temp;
    }
    public void printint(int[] ints){
        for (int i = 0;i < ints.length;i++){
            System.out.print(ints[i]);
        }System.out.print("\n");
    }
}