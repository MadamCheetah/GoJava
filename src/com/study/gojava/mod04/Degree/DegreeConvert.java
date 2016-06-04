package com.study.gojava.mod04.Degree;

public class DegreeConvert{

    public static double fromCelsiusToFahrenheit(double c){
        return (c*1.8+32);
    }

    public static double fromFahrenheitToCelsius(double f){
        return (f-32)/1.8;
    }

    public static void main(String[] args){
        System.out.println("The result of the ice melting temperature conversion from Celsius to Fahrenheit is " + fromCelsiusToFahrenheit(0.0) + " F");
        System.out.println("The result of boiling point of water conversion from Fahrenheit to Celsius is " + fromFahrenheitToCelsius(212.0) + " C");
    }


}
