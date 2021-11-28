package com.tsdv.dttung;

public class Square extends Rectangle {
    public Square() {
        super("No name", 1.0, 1.0);
        setType("Square");
    }
    public Square(String name, double side) {
        super(name, side, side);
        setType("Square");
    }
    public double getSide() {
        return getWidth();
    }
    @Override
    public String toString() {
        return getBasicInfo() + " side: " + getSide();
    }
}
