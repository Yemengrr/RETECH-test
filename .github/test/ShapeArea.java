package test;

public interface ShapeArea {
    public final double pi =Math.PI;
    public double getArea ();
    public double getPerimeter ();
}
class Circle implements ShapeArea {
    private final double radius;
    Circle (double r){
        radius=r;
    }
    public double getArea (){
        return ((int)(pi*radius*radius*10000))/10000.0;
    }
    public double getPerimeter (){
        return ((int)(2*pi*radius*10000))/10000.0;
    }
    public String toString (){
        return "radius="+ this.radius +", perimeter="+ this.getPerimeter()+", area="+ this.getArea ();
    }
}