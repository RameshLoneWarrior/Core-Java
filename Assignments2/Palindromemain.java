package com.te.Assignments2;

import java.util.Scanner;

public class Palindromemain {

	public static void main(String[] args) 
	{
		System.out.println("*************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum = Palindrome.addPalindromes(num1,num2);
		System.out.println("The Sum of Palindrome number is ="+sum);
		System.out.println("***********");
       sc.close();
	}

}
