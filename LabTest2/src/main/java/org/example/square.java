package org.example;

public class square implements Shape{
    double side;
    String color="";
    public square(double side){
        this.side = side;
    }
    @Override
    public double Area(){
        return side * side;
    }
    @Override
    public double Perimeter(){
        return 4 * side;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String showColor(){
        return color;
    }
}
