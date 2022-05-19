package com.te.assignments1;

public class SumofDigits 
{
public static int sumOfSquaresOfEvenDigits(int num)
{
	int esqu=0;
	while(num>0)
	{
		int rem=num%10;
		if(num%2==0)
		{
			esqu=esqu+rem*rem;
		}
		num=num/10;
	}
    System.out.println("The sum of squares of EvenDigits is " + esqu);
    return esqu;	
    //System.out.println("The sum of squares of EvenDigits is " + esqu);
}
}



