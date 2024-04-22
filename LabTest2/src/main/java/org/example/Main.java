package org.example;

public class Main {
    /*
    Create instances of shapes (e.g., circles, squares, triangles) and colors (e.g., red, blue, green) by interacting in main class.
    */

    public static void main(String[] args) {
        color Red = new color("Red");
        color Blue = new color("Blue");
        color Green = new color("Green");
        circle c = new circle(5);
        System.out.println("Area of circle: " + c.Area());
        System.out.println("Perimeter of circle: " + c.Perimeter());
        
        square s = new square(5);
        System.out.println("Area of square: " + s.Area());
        System.out.println("Perimeter of square: " + s.Perimeter());

        c.setColor(Red.getColor());
        s.setColor(Blue.getColor());
        
        triangle t = new triangle(3, 4, 5);
        System.out.println("Area of triangle: " + t.Area());
        System.out.println("Perimeter of triangle: " + t.Perimeter());
        t.setColor(Green.getColor());

        System.out.println("Color of circle: " + c.showColor());
        System.out.println("Color of square: " + s.showColor());
        System.out.println("Color of triangle: " + t.showColor());
    }
}