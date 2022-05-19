package com.te.assignments1;

public class Occurances 
{
public static int countSeven(int num)
{
	int count=7;
	int sum=0;
	while(num>0)
	{
	int rem=num%10;
	if(count==rem)
	{
		sum++;	
	}
	num=num/10;
}
	System.out.println("The occurances of digit seven is = " + sum);
	return num;
}
}
