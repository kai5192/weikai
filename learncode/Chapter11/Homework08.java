package learncode.Chapter11;

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //演示枚举值得switch的使用
        //switch的语句块如果没有break将会运行后面所有语句块直到退出
        switch (green){
            case RED:
                System.out.println("匹配红色");
                break;
            case BLACK:
                System.out.println("匹配黑色");
                break;
            case BLUE:
                System.out.println("匹配蓝色");
                break;
            case GREEN:
                System.out.println("匹配绿色");
                break;
            case YELLOW:
                System.out.println("匹配黄色");
                break;
            default://最好加上default
                System.out.println("没有对应颜色");
                break;
        }
    }
}

enum Color implements ColorInterface {
    //常量用大写
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private double redValue;
    private double greeValue;
    private double blueValue;

    Color(double redValue, double greeValue, double blueValue) {
        this.redValue = redValue;
        this.greeValue = greeValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue: " + redValue + "\t"+
                "greeValue " + greeValue + "\t" +
                        "blueValue " + "\t" + blueValue);
    }
}

interface ColorInterface {
    void show();
}