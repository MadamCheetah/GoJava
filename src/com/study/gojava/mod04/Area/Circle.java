package com.study.gojava.mod04.Area;

public class Circle

{
    private double radius;
    final static double PI = 3.1415926;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    static double square(double x)
    {
        return x*x;
    }

    public double findArea()
    {
       return PI*square(this.radius);
    }


}
