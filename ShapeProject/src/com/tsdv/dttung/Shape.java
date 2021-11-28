package com.tsdv.dttung;

public abstract class Shape {
    protected String name;
    protected String type;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shape() {
        name = "No name";
        type = "General shape";
        //System.out.println("Default constructor of Shape");
    }

    public Shape(String name, String type) {
        setName(name); // this.name = name;
        setType(type);
        //System.out.println("Parameter constructor of Shape");
    }

    @Override
    public String toString() {
        return getBasicInfo();
    }
    @Override
    public boolean equals(Object obj) {
        Shape s = (Shape) obj;
        return this.getArea() == s.getArea();
    }
    protected String getBasicInfo() {
        return type + " " + name + ": ";
    }

    public abstract double getArea();
}
