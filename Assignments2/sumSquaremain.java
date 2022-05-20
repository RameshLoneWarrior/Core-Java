package com.te.Assignments2;

import java.util.Scanner;

public class sumSquaremain 
{
public static void main(String[] args) 
{
	System.out.println("*************");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int esqu=sumSquare.getSumOfSquaresOfDigits(num);
	System.out.println("The sum of squares of EvenDigits is " + esqu);
	System.out.println("***********");
   sc.close();
}
}
