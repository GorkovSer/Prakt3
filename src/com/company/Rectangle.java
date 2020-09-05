package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width, double length){}
    public Rectangle(double width, double length, String color, boolean filled){}

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return  "color: " + color +
                "\nwidth: " + width +
                "\nlength: " + length +
                "\nperimeter: " + getPerimeter() +
                "\narea: " + getArea();
    }

}

