package Chapter08.Super;

import Chapter08.Car;

public class Cfmodel {

    public double idm(Car car1,Car car2,double alpha,double beta,double v0,double s0,double t){
        double s_star;
        s_star = s0 + t*car1.getSpeed()-car1.getSpeed()*
                (car2.getSpeed()-car1.getSpeed())/ Math.sqrt(2*(alpha*beta));
        double acc;
        acc = alpha*(1-(car1.getSpeed()/v0)*4*4-
                (s_star/Math.pow(car2.getXlacation()-car2.getXlacation(),2)));
        return acc;
    }

    public double ov(Car car1,Car car2,double alpha){
        double ovf ;
        double acc;
        ovf = 0.5* car1.getAcc()*(Math.tanh((car2.getXlacation()-car1.getXlacation()-car1.getCar_l()))
                +Math.tanh(car1.getCar_l()));
        acc = 
    }
}
