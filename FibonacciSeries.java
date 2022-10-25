package com.FibonacciSeries;
import java.util.Scanner;
public class FibonacciSeries
{
    int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        FibonacciSeries obj = new FibonacciSeries();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a limit");
        int x = in.nextInt();
        System.out.println("Fibonacci Series");
        for(int i=0;i<=x;i++)
            System.out.print(obj.fib(i)+ " , ");
    }
}
