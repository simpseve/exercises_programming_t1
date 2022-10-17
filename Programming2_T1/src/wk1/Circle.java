package wk1;

public class Circle {
    double radius = 1.8;
    String colour = "red";

    public Circle(double newRadius,double number){
        radius = newRadius;
        colour = setColour(number);
    }

    public Double getRadius(){
        return radius;
    }
    public double getArea(){

        return 3.14*(radius*radius);
    }

    public String setColour(double argument){
        if(argument >= 0 && argument <= 5){
            colour = "red";
            System.out.println(colour);
        }else if(argument >= 6 && argument <= 10){
            colour = "amber";
            System.out.println(colour);
        }else if(argument >= 11 && argument <= 15){
            colour = "yellow";
            System.out.println(colour);
        }else if(argument >= 16 && argument <= 20){
            colour = "green";
            System.out.println(colour);
        }else if(argument >= 21 && argument <= 25){
            colour = "blue";
            System.out.println(colour);
        }else{
            colour = "purple";
            System.out.println(colour);
        }
        return colour;
    }

    public String getColour(){
        return colour;
    }
}
