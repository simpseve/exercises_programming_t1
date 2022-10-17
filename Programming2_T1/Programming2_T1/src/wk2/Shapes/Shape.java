package wk2.Shapes;

public abstract class Shape {

    protected String colour;
    protected boolean filled;

    public Shape(){};
    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return colour;
    }
    public void setFilled(boolean filled){
        this.filled =filled;
    }
    public boolean getFilled(){
        return filled;
    }
    public abstract String toString();
    public abstract double getArea();
    public abstract double getPerimeter();
}
