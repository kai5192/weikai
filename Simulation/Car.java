package Chapter08;

import Chapter08.Super.Cfmodel;

public class Car {
    protected double alpha;
    protected double beta;
    protected double v0;
    protected double s0;
    protected double t = 0.01;
    private String type;
    private double xlacation;
    private double ylocation;
    private double car_l;
    private double vmax;
    private double speed;
    private double acc;
    private double amax;
    private int[] roadArray;//[0,0]两侧都不能走，
    // [1,0]可以左换道，[0,1]可以右换道，[1,1]两个方向都可以

    //计算加速度
    public void accUpgrade(Car car){
        Cfmodel cfmodel = new Cfmodel();
        if(type.equals("idm")){
            this.acc = cfmodel.idm(this,car,alpha,beta,v0,s0,t);
        }
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getXlacation() {
        return xlacation;
    }

    public void setXlacation(double xlacation) {
        this.xlacation = xlacation;
    }

    public double getYlocation() {
        return ylocation;
    }

    public void setYlocation(double ylocation) {
        this.ylocation = ylocation;
    }

    public double getCar_l() {
        return car_l;
    }

    public void setCar_l(double car_l) {
        this.car_l = car_l;
    }

    public double getVmax() {
        return vmax;
    }

    public void setVmax(double vmax) {
        this.vmax = vmax;
    }

    public double getAmax() {
        return amax;
    }

    public void setAmax(double amax) {
        this.amax = amax;
    }

    public int[] getRoadArray() {
        return roadArray;
    }

    public void setRoadArray(int[] roadArray) {
        this.roadArray = roadArray;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }
}
