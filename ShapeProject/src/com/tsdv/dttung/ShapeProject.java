package com.tsdv.dttung;

public class ShapeProject {

    public static void main(String[] args) {
//        Shape s1 = new Shape();
//        Shape s2 = new Shape("ABCD", "Rectangle");
//        System.out.println(s1);
//        System.out.println(s2.toString());
//
//        Circle c1 = new Circle();
//        System.out.println(c1);
//
//        Circle c2 = new Circle("R1", 2.0);
//        System.out.println(c2);
//
//        System.out.println("Area of " + s2.getName() + ": " + s2.getArea());
//        System.out.println("Area of " + c2.getName() + ": " + c2.getArea());
//
//        Rectangle r1 = new Rectangle("MNPQ", 2.0, 8.0);
//        Square sq1 = new Square("ZXVB", 4.0);
//
//        System.out.println(r1 + "\n" + sq1);
//        System.out.println(r1.getArea());
//        System.out.println(sq1.getArea());
//
//        if (r1.equals(sq1)) System.out.println("Equals");
//        else System.out.println("Not equals");
//
//        if (r1 == sq1) System.out.println("Equals");
//        else System.out.println("Not equals");.
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle("R1", 4.0);
        shapes[2] = new Rectangle("ABCD", 2.0, 5.0);
        shapes[3] = new Square("ZXCB", 10.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getName() + ": " + shapes[i].getArea());
        }

    }
}
