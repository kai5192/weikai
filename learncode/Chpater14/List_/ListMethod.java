package learncode.Chpater14.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WeiKai
 * @version 1.0
 */
public class ListMethod {
    public static void main(String[] args) {
        //1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 [案例]
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list"+list);
        //2. List 集合中的每个元素都有其对应的顺序索引，即支持索引
        // Object get(int index):获取指定 index 位置的元素
        // 索引是从 0 开始的
        System.out.println(list.get(1));//tom
        //3.void add(int index, Object ele):在 index 位置插入 ele 元素
        System.out.println("list的大小"+list.size());
        list.add(5,"张三丰");//此处的索引最大值为list.size()-1+1
        list.add("贾宝玉");//不输入索引默认加到最后一个位置
        //4. boolean addAll(int index, Collection eles):从 index 位置开始将 eles 中的所有元素添加进来
        ArrayList list1 = new ArrayList();
        list1.add("张三");
        list1.add("李四");
        list.addAll(1,list1);
        System.out.println("list"+list);
        //6.int indexOf(Object obj):返回 obj 在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//3
        //7.int lastIndexOf(Object obj):返回 obj 在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf("tom"));//6
        System.out.println(list.indexOf("hhh"));//列表中没有该值返回-1
        //8.Object remove(int index):移除指定 index 位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list="+list);
        //8.Object removeALL(Collection collection)//移除一个子集合
        list.removeAll(list1);
        System.out.println("list="+list);
        // Object set(int index, Object ele):设置指定 index 位置的元素为 ele , 相当于是替换.
        list.set(0,"Tom");
        System.out.println("list="+list);
        // List subList(int fromIndex, int toIndex):返回从 fromIndex 到 toIndex 位置的子集合
        // 注意返回的子集合 fromIndex <= subList < toIndex
        List list2 = list.subList(0,3);//左开右闭
        System.out.println("list2="+list2);
    }
}
