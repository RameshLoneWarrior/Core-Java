package com.te.assignments1;

public class Reverse 
{
public static int reverseNumber(int num)
{
	while(num>0)
	{
		int rem=num%10;
		System.out.print(rem);
		num=num/10;
	}
	System.out.println();
	return num;
}
}
