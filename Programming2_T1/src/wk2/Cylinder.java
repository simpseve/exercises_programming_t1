package wk2;

public class Cylinder extends Circle {

    private double height = 2;

    public Cylinder(double radius, String colour,double height) {
        super(radius, colour);
        this.height = height;
    }
    public Cylinder(){}

    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }


    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return  (3.14) *(radius*radius)*(height);
    }

}
