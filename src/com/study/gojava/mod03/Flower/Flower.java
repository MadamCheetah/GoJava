package com.study.gojava.mod03.Flower;

public abstract class Flower {

    private String colour;
    private boolean smell;
    private double price;

    public void cut() {
        System.out.println("It's time to cut the flower.");
    }

    public void water() {
        System.out.println("It's time to water the flower.");
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public boolean isSmell(){
        return smell;
    }

    public void setSmell(boolean smell){
        this.smell = smell;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
