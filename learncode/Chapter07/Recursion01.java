package learncode.Chapter07;

public class Recursion01 {
    public static void main(String[] args){
       T t = new T();
       int returnfactorial = t.factorial(10);
       System.out.println(returnfactorial);
       int j = t.peibonaqie(7);
        System.out.println(j);
        int c = t.cc(10);
        System.out.println(c);
    }
}



class T{
    //阶乘
    public int factorial(int n){
        if(n>1){
            return factorial(n - 1)*n;
        }else return 1;
    }//使用递归求出佩波那契数1，1，2，3，5，8，13....给你一个整数求出它的值是多少
    public int peibonaqie(int n){
        if(n > 2){
            return peibonaqie(n-1) + peibonaqie(n - 2);
        }else return 1;
    }//猴子吃桃儿：有一堆桃子，猴子第一天吃了其中的一般，并再多吃了一个!以后的每一天猴子都吃其中的一般，
    // 然后再多吃一个。当到第10天时，想再吃（还没有吃），发现只有1个桃子了。问题：最初有多少只桃子
    /*
    1,4,10,22...(前一个加1乘2)
     */
    public int cc(int n){
        if(n > 1){
            return (cc(n - 1) + 1)*2;
        }else return 1;
    }
}