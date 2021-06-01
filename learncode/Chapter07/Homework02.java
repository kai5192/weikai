package learncode.Chapter07;

public class Homework02 {
    public static void main(String[] args){
        //编写一个类A02定义，定义方法find,实现查找某字符串是否在字符串数组中并返回索引，
        //如果找不到，返回-1
        String[] strings= {"张飞","赵云","关羽"};
        A02 a02 = new A02();
        int index = a02.find(strings,"李四");
        if (index == -1){
            System.out.println("该字符串不在数组中");
        }else {
            System.out.println("该字符串在数组中，它的索引为"+ index);
        }
    }
}
class A02{
    public int find(String[] strings,String s){
        int returnIndex = -1;
        for (int i = 0;i<strings.length;i++){
            if(s.equals(strings[i])){
                returnIndex = i;
            }
        }return returnIndex;
    }
}