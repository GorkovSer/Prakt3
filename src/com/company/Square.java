package com.company;

public class Square extends Rectangle
{
    public Square(){}
    public Square(double radius){}
    public Square(double radius, String color, boolean filled){}

    public double getSide() {
        return width;
    }

    public void setSide(double width) {
        this.width = width;
        this.length = width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public String toString() {
        return  "color: " + color +
                "\nside: " + getSide() +
                "\nperimeter: " + getPerimeter() +
                "\narea: " + getArea();
    }
}
