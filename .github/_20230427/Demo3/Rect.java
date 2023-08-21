package _20230427.Demo3;

public class Rect {
    double a;
    double b;

    public double getD(double a,double b){
        double d;
        d=(2*a)+(2*b);
        return d;
    }
    public double getS(double a,double b){
        double s;
        s=a*b;
        return s;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rect(double a) {
        this.a = a;
    }
}
