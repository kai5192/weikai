package ProgramExercise.OrderSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public int orderCount =0; //记录订单号
    public void showMenu() {
        boolean boo = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("          主食             ");
        //1.定义水饺
        Map typeShuijiao = new HashMap();
        typeShuijiao.put("素三鲜", 12);
        typeShuijiao.put("酸菜油吱啦", 12);
        ShuiJiao shuiJiao = new ShuiJiao("水饺", typeShuijiao);
        //2.定义猪肉/炒面/炒饭/旦旦面
        Map typeDanPin = new HashMap();
        typeDanPin.put("猪肉", 16);
        typeDanPin.put("鸡蛋炒面", 6);
        typeDanPin.put("火腿炒面", 6);
        typeDanPin.put("肉炒面", 7);
        typeDanPin.put("鸡蛋炒饭", 6);
        typeDanPin.put("扬州炒饭", 7);
        DanPin danPin = new DanPin(typeDanPin);
        //3.定义面条
        Map typeMianTiao = new HashMap();
        typeMianTiao.put("小碗", 2);
        typeMianTiao.put("中碗", 2);
        typeMianTiao.put("大碗", 2);
        MianTiao mianTiao = new MianTiao("面条", typeMianTiao);
        //4.定义烙豆子，汤饺和旦旦面
        Map typemifan = new HashMap();
        typemifan.put("小碗", 2);
        typemifan.put("大碗", 3);
        Map typedouZi = new HashMap();
        typedouZi.put("小碗", 2);
        typedouZi.put("大碗", 2);
        Map typedandan = new HashMap();
        typedandan.put("小碗", 4);
        typedandan.put("大碗", 5);
        Shuangpin douzi = new Shuangpin("烙豆子", typedouZi);
        Shuangpin mifan = new Shuangpin("米饭", typemifan);
        Shuangpin dandan = new Shuangpin("旦旦面", typedandan);
        //5.定义鱼类
        Fish fish1 = new Fish("鲤 鱼", new String[]{"豆瓣", "红烧", "家炖"}, 30);
        Fish fish2 = new Fish("刀 鱼", new String[]{"干炸", "红烧", "家炖"}, 16);
        Fish fish3 = new Fish("小黄鱼", new String[]{"干炸", "干煎"}, 30);
        Fish fish4 = new Fish("青鱼", new String[]{"干炸", "家炖"}, 30);
        danPin.showDetail();
        mianTiao.showDetail();
        douzi.showDetail();
        mifan.showDetail();
        dandan.showDetail();
        fish1.showDetail();
        fish2.showDetail();
        fish3.showDetail();
        fish4.showDetail();
        Map fishCollection = new HashMap();
        fishCollection.put("鲤 鱼",30);
        fishCollection.put("刀 鱼",16);
        fishCollection.put("小黄鱼",30);
        fishCollection.put("青鱼",30);
        System.out.println();
        shuiJiao.showDetail();
        //点餐
        System.out.println("============请开始点餐=================");
        int price = 0;
        String detail = "";
        int temp;
        while (boo) {
            System.out.println("请输入你要的食物（猪肉/炒面/炒饭/旦旦面/水饺/鱼类）");
            String orderFood = scanner.next();
            //1.是否为猪肉/炒面/炒饭/旦旦面
            if (typeDanPin.containsKey(orderFood)) {
                System.out.println("您需要多少份？");
                temp = scanner.nextInt();
                price += temp * (int) typeDanPin.get(orderFood);
                detail += orderFood + "  x" + temp + "\n";
            }//是否为炒米炒面
            else if(orderFood.equals("炒面")||orderFood.equals("炒米")){
                System.out.println("请选择口味(鸡蛋炒面/火腿炒面/肉炒面/鸡蛋炒饭/扬州炒饭)");
                String tasteMian = scanner.next();
                System.out.println("您需要多少份？");
                temp = scanner.nextInt();
                price += temp * (int) typeDanPin.get(tasteMian);
                detail += orderFood + "  x" + temp + "\n";
            }
            //3.水饺
            else if (orderFood.equals("水饺")) {
                System.out.println("请选择口味（素三鲜/酸菜油吱啦）");
                String tasteShuijiao = scanner.next();
                System.out.println("您需要多少份？");
                temp = scanner.nextInt();
                price += temp * (int) typeShuijiao.get(tasteShuijiao);
                detail += orderFood + "  x" + temp +"    口味为："+tasteShuijiao+ "\n";
            }//4.鱼类
            else if(orderFood.equals("鱼类")){
                System.out.println("请选择种类（鲤 鱼/刀 鱼/小黄鱼/青鱼）");
                String typeYu = scanner.next();
                System.out.println("请选择对应的口味");
                String tastYU = scanner.next();
                System.out.println("您需要多少份？");
                temp = scanner.nextInt();
                price += temp * (int) fishCollection.get(typeYu);
                detail += orderFood + "  x" + temp +"    口味为："+tastYU+ "\n";
            }
            else {
                System.out.println("请输入正确的菜品");
                continue;
            }
            //加几个if
            System.out.println("是否还需要点餐呢？（y/n）");
            String isEnd = scanner.next();
            if (!(isEnd.charAt(0) == 'y' || isEnd.charAt(0) == 'n')) {
                System.out.println("输入错误，请重新输入");
            }
            if (isEnd.charAt(0) == 'n') {
                boo = false;
            }
        }
        System.out.println("============您的订单如下：================");
        System.out.println("订单编号：    "+orderCount);
        System.out.println("菜单详情：");
        System.out.println(detail);
        System.out.println("订单总金额：   "+price+"元");
        System.out.println("折扣："    +"待开发");
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("订单完成时间:  "+format);

    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }

}
