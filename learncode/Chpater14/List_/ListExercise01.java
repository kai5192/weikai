package learncode.Chpater14.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);
        list.add(1,"hsp");//插入
        System.out.println("插入2号位"+list);
        System.out.println(list.get(4));//获得第五个元素
        System.out.println(list);
        list.remove(5);//删除第6个元素
        System.out.println("删除第6个元素"+list);
        list.set(6,"xg");//修改第7个元素
        System.out.println("修改第7个元素"+list);
        //三种遍历方式，Iterator和增强for直接获得对象
        //第三种普通循环需要借助get函数
        Iterator iterator =list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next.toString());
        }
        System.out.println();
        for (Object str :list) {
            System.out.print(str.toString());
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }


    }

}
