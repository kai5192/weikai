package learncode.Chpater14.Collection__;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add:添加单个元素
        list.add("红楼梦");
        list.add("三国演绎");
        list.add(10);//list.add(new Integer(10))
        // remove:删除指定元素（两类）
        //第一类输入索引
        list.remove(0);//删除第0个元素
        System.out.println(list);
        //第二类输入对象
        list.remove(new Integer(10));//删除指定的对象
        System.out.println(list);
        // contains:查找元素是否存在
        System.out.println(list.contains("三国演绎"));
        // size:获取元素个数
        System.out.println(list.size());
        // isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        // clear:清空
        list.clear();
        List list1 = new ArrayList();
        list1.add("三国演义");
        list1.add("水浒传");
        list1.add("红楼梦");
        list1.add("西游记");
        System.out.println(list);
        // addAll:添加多个元素
        list.addAll(list1);
        System.out.println(list);
        // containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list1));
        // removeAll：删除多个元素
        list.add("xixi");
        list.removeAll(list1);
        System.out.println(list);
    }
}
