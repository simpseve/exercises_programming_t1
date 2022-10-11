package wk2;

import wk2.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Radius 1: " + c1.getRadius() + "\n Volume 1: "+ c1.getVolume());
        Cylinder c2 = new Cylinder(2,3);
        System.out.println("Radius 2: " + c2.getRadius()  +"\nHeight 2: " + c2.getHeight()  +"\n Volume 2: "+ c2.getVolume());

    }
}
