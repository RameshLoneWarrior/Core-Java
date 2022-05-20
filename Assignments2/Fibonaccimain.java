package com.te.Assignments2;

import java.util.Scanner;


class Fibonaccimain
{
	public static void main(String[] args) 
	{
	System.out.println("***********");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int a=Fibonacci.getSumOfNfibos(num);
	System.out.println("The sum of factorial is = "+a);
	System.out.println("***********");
	}
}