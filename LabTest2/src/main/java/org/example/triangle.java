package org.example;

public class triangle implements Shape{
    
    double side1, side2, side3;
    String color="";
    public triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double Area(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double Perimeter(){
        return side1 + side2 + side3;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String showColor(){
        return color;
    }
}
