package com.tsdv.dttung;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
        super("No name", "Rectangle");
        width = 1.0;
        height = 2.0;
    }

    public Rectangle(String name, double width, double height) {
        super(name, "Rectangle");
        setWidth(width);
        setHeight(height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + " height: " + height + " , width: " + width;
    }
}
