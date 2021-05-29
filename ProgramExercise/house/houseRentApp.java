package ProgramExercise.house;

import ProgramExercise.house.view.HouseMenu;

public class houseRentApp {
    public static void main(String[] args) {
        //创建houseMenu对象并显示主菜单
        new HouseMenu().mainMenu();
        System.out.println("你退出了房屋出租系统");
    }
}
