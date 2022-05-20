package com.te.Assignments2;

import java.util.Scanner;

public class nonPrimemain 
{
public static void main(String[] args) 
{
	System.out.println("*************");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int a=nonPrime.addNumbers(num);
	System.out.println("The sum of non prime number is = " + a);
	System.out.println("***********");
   sc.close();
}
}
