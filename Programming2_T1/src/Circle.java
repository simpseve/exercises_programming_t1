public class Circle {
    double radius = 1.8;
    String colour = "red";

    public Circle(double newRadius){
        radius = newRadius;
        colour = "red";
    }

    public Double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*(radius*radius);
    }

}
