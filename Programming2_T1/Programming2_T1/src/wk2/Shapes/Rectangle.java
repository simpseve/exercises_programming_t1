package wk2.Shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length=length;
    }
    public Rectangle(double width, double length,String colour,boolean filled){
        this.width = width;
        this.length=length;
        this.colour = colour;
        this.filled=filled;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    @Override
    public String toString() {
        return "Rectangle[length: "+length+",width: "+width+",colour: "+colour+",filled: "+filled + "]";
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (2*(length)) + (2*(width));
    }

    ;


}
