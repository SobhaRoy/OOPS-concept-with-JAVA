import java.util.*;
import java.io.*;


abstract class Shape
{
    String color;

    Shape(String c)
    {
        color = c;
    }

    abstract void calculateArea();
    abstract void draw();
}


class Circle extends Shape
{
    double radius;

    Circle(String c, double r)
    {
        super(c);
        radius = r;
    }

    void calculateArea()
    {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    void draw()
    {
        System.out.println("Drawing a " + color + " Circle");
    }
}


class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(String c, double l, double b)
    {
        super(c);
        length = l;
        breadth = b;
    }

    void calculateArea()
    {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void draw()
    {
        System.out.println("Drawing a " + color + " Rectangle");
    }
}


class Paymentgatewayintegration
{
    public static void main(String args[])
    {
        Circle c = new Circle("Red", 5);
        c.draw();
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle("Blue", 4, 6);
        r.draw();
        r.calculateArea();
    }
}