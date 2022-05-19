package com.te.assignments1;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		System.out.println("*****************");
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int number=sc1.nextInt();
		 Unique.getUnique(number);
		 System.out.println("*****************");
	     sc1.close();

	}

}
