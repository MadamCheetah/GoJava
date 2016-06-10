package com.study.gojava.mod04.Area;

public class Area {
    public static void main(String[] args){

        Circle circle = new Circle(4.2);
        Triangle triangle = new Triangle(6.3, 5.9);
        Rectangle rectangle = new Rectangle(9.85, 7.52);

        System.out.println("The square of the circle of radius " + circle.getRadius() + " is " + circle.findArea());
        System.out.println("The square of the triangle of base " + triangle.getBaseOfTriangle() + " and height of " + triangle.getHeightOfTriangle() + " is " + triangle.findArea());
        System.out.println("The square of the rectangle of height " + rectangle.getHeightOfRectangle() + " and width of " + rectangle.getWidthOfRectangle() + " is " + rectangle.findArea());
    }
}
