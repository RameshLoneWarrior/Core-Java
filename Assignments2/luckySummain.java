package com.te.Assignments2;

import java.util.Scanner;

public class luckySummain {
public static void main(String[] args) {
	System.out.println("*************");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	int sum=luckySum.getLuckySum(num1,num2,num3);
	System.out.println("The sum of Lucky numbers is  :"+sum);
	System.out.println("***********");
   sc.close();
}
}
