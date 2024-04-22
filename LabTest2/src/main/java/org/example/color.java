package org.example;

public class color {
    
    String name;
    public color(String name){
        this.name = name;
    }
    public void showcolor(){
        System.out.println("The color is: " + name);
    }

    public String getColor(){
        return name;
    }
    
    public class Red extends color{
        public Red(String name){
            super(name);
        }
    }
    public class Blue extends color{
        public Blue(String name){
            super(name);
        }
    }
    public class Green extends color{
        public Green(String name){
            super(name);
        }
    }

}
