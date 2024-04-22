package org.example;

public class circle implements Shape{
    double radius;
    String color="";
    public circle(double radius){
        this.radius = radius;
    }
    @Override
    public double Area(){
        return 3.1416 * radius * radius;
    }
    @Override
    public double Perimeter(){
        return 2 * 3.1416 * radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String showColor(){
        return color;
    }
}
