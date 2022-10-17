package wk2.Shapes;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        this.length=side;
    }
    public Square(double side,String colour, boolean filled){
        this.length=side;
        this.filled=filled;
        this.colour=colour;
    }
    public void setSide(double side){
        this.length=side;
    }
    public double getSide(){
        return length;
    }
    @Override
    public void setWidth(double side){
        this.width=side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Square[Sides: "+ length+ "]";
    }
}
