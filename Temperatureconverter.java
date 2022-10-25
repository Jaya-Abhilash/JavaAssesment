package com.temperatureconverter;
import java.util.Scanner;
public class Temperatureconverter
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        float F = in.nextFloat();
        float C = (F - 32) * (9f / 5);
        System.out.println(F + "degree Fahrenheit is equal to"+" "+ C +" "+"degree Celsius");
    }
}
