package com.study.gojava.mod04.Area;

public class Triangle{

    private double baseOfTriangle;
    private double heightOfTriangle;

    public Triangle(double baseOfTriangle, double heightOfTriangle){
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    public double getBaseOfTriangle() {
        return baseOfTriangle;
    }

    public void setBaseOfTriangle(double baseOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
    }

    public double getHeightOfTriangle() {
        return heightOfTriangle;
    }

    public void setHeightOfTriangle(double heightOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
    }

    public double findArea(){
        return this.baseOfTriangle*this.heightOfTriangle*0.5;
    }
}
