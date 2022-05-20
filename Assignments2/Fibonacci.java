package com.te.Assignments2;

public class Fibonacci
{

public static int getSumOfNfibos(int num)
{
	int sum=0;
	int n1=0,n2=1,n3;
	for(int i=3;i<num;i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	 sum=sum+i;
		
	}
	
	return sum;
	
	}
	
}

