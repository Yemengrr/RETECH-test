package _20230427.Demo3;

public class Square {
    double l;

    public double getD(double l){
        double d;
        d=(2*l)+(2*l);
        return d;
    }
    public double getS(double l){
        double s;
        s=l*l;
        return s;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Square(double l) {
        this.l = l;
    }
}
