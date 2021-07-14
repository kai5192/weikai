package learncode.Chpater14.LinkedList__;

import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove((Integer)2);
        System.out.println(linkedList);
    }
}
