package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(){}
    public Circle(double radius){}
    public Circle(double radius, String color, boolean filled){}


    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius +
                "\nColor: " + color +
                "\nPerimeter:" + getPerimeter() +
                "\nArea: " + getArea();
    }
}
