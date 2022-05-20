package com.te.assignments1;

import java.util.Scanner;

public class main 
{
	public static void main (String[]args) 
	{
	 System.out.println("*****************");
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc1.nextInt();
	 UserMaincode.checkSum(num);
	 System.out.println("*****************");
     sc1.close();
	}

	

}
