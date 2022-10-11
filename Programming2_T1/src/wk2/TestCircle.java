package wk2;

import wk2.Circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Circles radius is: " + circle.getRadius() + "\n Circles area is: "+ circle.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("\nCircle two's radius is: "+ circle2.getRadius()+ "\nCircles area is: "+ circle2.getArea());
    }
}
