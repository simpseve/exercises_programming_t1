package wk2;

import java.util.Scanner;

public class Circle {
    double radius = 1.0;
    String colour = "red";

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String colour){
       this.radius = radius;
       this.colour = colour;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){

        return 3.14*(radius*radius);
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String toString(){
        return "Circle [radius=" +radius+ ",colour="+colour+"]";
    }




}
