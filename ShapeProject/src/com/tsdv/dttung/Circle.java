package com.tsdv.dttung;

public class Circle extends Shape {
    public final double PI = 3.14;
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 1.0;
        type = "Circle"; // better call setType
        //System.out.println("Default constructor of Circle");
    }
    public Circle(String name, double radius) {
        super(name, "Circle");
        setRadius(radius);
        //System.out.println("Parameter constructor of Circle");
    }
    @Override
    public String toString() {
        return super.toString() + "radius = " + radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
