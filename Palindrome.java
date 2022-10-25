package com.Palindrome;
import java.util.Scanner;

public class Palindrome
{
    public static void main(String [] agrs)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not ");
        String input=sc.nextLine();
        if (isPalindrome(input))
        {
            System.out.println(input+" is a palindrome. ");
        }
        else
        {
            System.out.println(input+" is not a palindrome. ");
        }
    }
    public static boolean isPalindrome(String str)
    {
        int left=0,rignt=str.length()-1;
        while (left<rignt)
        {
            if(str.charAt(left)!=str.charAt(rignt))
            {
                return false;
            }
            left++;
            rignt--;
        }
        return true;
    }
}