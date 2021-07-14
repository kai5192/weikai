package learncode.Chpater14.LinkedList__;

/**
 * @author WeiKai
 * @apiNote 简单演示链表结构
 */
public class LinkedList01 {
    public static void main(String[] args) {
        Node1 jack = new Node1("jack");
        Node1 tom = new Node1("tom");
        Node1 lili = new Node1("lili");
        //连接三个结点，形成正向链表
        //jack->tom->lili
        jack.next = tom;
        tom.next = lili;
        //jack<-tom<-lili
        tom.pre = jack;
        lili.pre = tom;
        //定义首尾结点
        Node1 first = jack;
        Node1 last = lili;
        //正循环遍历
        System.out.println("================开始正循环================");
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first.toString());
            first =first.next;
        }
        System.out.println("================开始负循环================");
        while (true){
            if(last == null){
                break;
            }
            else {
                System.out.println(last.toString());
                last = last.pre;
            }
        }

        //演示链表的添加对象/数据，是多么的方便
        // 要求，是在 tom --------- 老韩直接，插入一个对象 smith
        //jack->tom->lili
        Node1 simth = new Node1("simth");
        simth.pre = tom;
        simth.next = lili;
        tom.next = simth;
        lili.pre = simth;
        //重新指向首尾
        first = jack;
        last = lili;

        //正循环遍历
        System.out.println("================开始正循环================");
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first.toString());
            first =first.next;
        }

        System.out.println("================开始负循环================");
        while (true){
            if(last == null){
                break;
            }
            else {
                System.out.println(last.toString());
                last = last.pre;
            }
        }
    }
}
class Node1{
    public Object item;//存放真正的数据
    public Node1 pre;//指向前一个结点
    public Node1 next;//指向后一个结点

    public Node1(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node1 name = "  + item ;
    }
}