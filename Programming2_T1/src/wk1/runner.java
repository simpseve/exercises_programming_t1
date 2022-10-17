package wk1;

import wk1.Circle;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
//        wk1.ex1_8 test = new wk1.ex1_8();
//        test.isMultiple(18L,20L);
//        test.isOdd(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:" );
        double radius = scanner.nextInt();
        System.out.println("Enter number:");
        double colour = scanner.nextInt();
        Circle circle = new Circle(radius,colour);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Colour: " + circle.getColour());
        System.out.println("Area: " + circle.getArea());
    }
}
