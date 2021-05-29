package ProgramExercise.house.servise;

import ProgramExercise.house.domain.House;

/**
 * 定义House[],保存House对象
 * 1.相应HouseView的调用
 * 2.完成对房屋信息的各种操作
 */
public class HouseServise {
    private House[] houses;//保存house对象
    private int houseNums = 1;//记录当前房屋信息数量
    private int idCounter = 1;//记录房屋id
    public HouseServise(int size){
        //new house
        houses = new House[size];//创建指定大小的数组
        //为配合测试列表，初始化一个对象
        houses[0] = new House(1,"jacl","112","haidian",5,"已出租");
    }
    //add方法添加新对象，返回boolean值
    public boolean add(House newHouse){
        //判断是否可以继续添加（暂时不考虑扩容）
        if(houseNums>= houses.length){
            System.out.println("内存已满，不能把再添加了");
            return false;
        }
        houses[houseNums++] = newHouse;
        //idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法返回house数组
    public House[] list(){
        return houses;
    }
}
