package com.study.gojava.mod04.Area;

public class Rectangle {

    private double heightOfRectangle;
    private double widthOfRectangle;

    Rectangle(double heightOfRectangle, double widthOfRectangle){
        this.heightOfRectangle = heightOfRectangle;
        this.widthOfRectangle = widthOfRectangle;
    }

    public double getHeightOfRectangle() {
        return heightOfRectangle;
    }

    public void setHeightOfRectangle(double heightOfRectangle) {
        this.heightOfRectangle = heightOfRectangle;
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }

    public void setWidthOfRectangle(double widthOfRectangle) {
        this.widthOfRectangle = widthOfRectangle;
    }

    public double findArea(){
        return this.heightOfRectangle*this.widthOfRectangle;
    }
}
