package com.TemperatureConverter;
import java.util.Scanner;
public class TemperatureConverter
{
    public static void main(String arg[])
    {
        float f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature");
        f=sc.nextFloat();
        System.out.println("Celsius temperature is ="+celsius(f));
    }
    static float celsius(float f)
    {
        return (f-32)*5/9;
    }
}