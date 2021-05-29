package ProgramExercise.house.view;

import ProgramExercise.house.domain.House;
import ProgramExercise.house.servise.HouseServise;
import ProgramExercise.house.utils.Utility;

/**
 * 1.显示主菜单
 * 2.接受用户输入
 * 3.带哦用servise完成房屋信息的各种操作
 */
public class HouseMenu {
    private boolean loop = true;//控制主菜单显示
    private char key = ' ';//接收用户选择
    private HouseServise houseServise = new HouseServise(10);
    //编写listHouse()显示房屋列表
    public void listHouse(){
        System.out.println("================显示房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseServise.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i].toString());
        }
        System.out.println("================房屋列表显示完毕================");
    }
    public void addHouse(){
        System.out.println("================添加房屋================");
        System.out.print("姓名： ");
        String name = Utility.readString(8);
        System.out.print("电话： ");
        String phone = Utility.readString(12);
        System.out.print("地址： ");
        String address = Utility.readString(16);
        System.out.println("月租： ");
        int rent = Utility.readInt();
        System.out.println("状态");
        String state = Utility.readString(3);
        //创建一个House对象
        House newHouse= new House(0,name,phone,address,rent,state);
        if (houseServise.add(newHouse)){
            System.out.println("================添加房屋成功================");
        }else {
            System.out.println("================添加房屋失败================");
        }
    }

    public void mainMenu() {
        //显示主菜单
        do {
            System.out.println("-----------------------房屋出租系统菜单-----------------------");
            System.out.println("\t\t\t\t1.新增房源");
            System.out.println("\t\t\t\t2.查找房源");
            System.out.println("\t\t\t\t3.删除房屋信息");
            System.out.println("\t\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t\t5.显示房屋信息");
            System.out.println("\t\t\t\t6.退出系统");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("房屋信息");
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
