package com.study.gojava.mod04.Degree;

public class DegreeConvert{

    public static double fromCelsiusToFahrenheit(double c){
        return (c*1.8+32);
    }

    public static double fromFahrenheitToCelsius(double f){
        return (f-32)/1.8;
    }

    public static void main(String[] args){
        Temperature celsius = new Temperature(25.6);
        Temperature fahrenheit = new Temperature(118.2);
        System.out.println(celsius.getT() + "C = " + fromCelsiusToFahrenheit(celsius.getT()) + "F");
        System.out.println(fahrenheit.getT() + "F = " + fromFahrenheitToCelsius(fahrenheit.getT()) + "C");

        System.out.println("The result of the ice melting temperature conversion from Celsius to Fahrenheit is " + fromCelsiusToFahrenheit(0.0) + " F");
        System.out.println("The result of boiling point of water conversion from Fahrenheit to Celsius is " + fromFahrenheitToCelsius(212.0) + " C");
    }


}
