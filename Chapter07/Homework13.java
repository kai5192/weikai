package Chapter07;

public class Homework13 {
    public static void main(String[] args){
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle,5);

    }
}
class Circle{
    double radious;
    public void findArea(){
        System.out.println("半径为"+radious+"的面积为" + (Math.PI*radious*radious));
    }
    public void setRadious(double p){
        this.radious = p;
    }
}
class PassObject{
    public void printAreas(Circle c,int times){
        for (int i = 1;i <=times;i++ ){
            c.setRadious(i);
            c.findArea();
        }
    }
}