package _20230427.Demo3;

public class Circle {
    double r;

    public double getD(double r){
        double d;
        double PI=3.1415926535;
        d=PI*r*2;
        return d;
    }
    public double getS(double r){
        double s;
        double PI=3.1415926535;
        s=PI*r*r;
        return s;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
