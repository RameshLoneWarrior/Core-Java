package com.te.Assignments2;

public class sumSquare 
{
	public static int getSumOfSquaresOfDigits(int num)
	{
		
	
	int esqu=0;
	while(num>0)
	{
		int rem=num%10;
		{
			esqu=esqu+rem*rem;
		}
		num=num/10;
	}
    return esqu;
}
}
