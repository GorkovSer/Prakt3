package com.company;

public class Main {

    public static void main(String[] args)
    {
	    Rectangle a = new Rectangle();
	    Circle b = new Circle();
	    Square c = new Square();


	    a.setLength(12);
	    a.setWidth(22);
	    a.setColor("Red");
	    a.setFilled(true);
		System.out.println(a.toString());

	    b.setRadius(10);
	    b.setColor("Blue");
	    b.setFilled(true);
		System.out.println("\n" + b.toString());

	    c.setLength(10);
	    c.setColor("Black");
	    c.setFilled(true);
		System.out.println("\n" + c.toString());



    }
}
