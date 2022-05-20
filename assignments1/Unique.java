package com.te.assignments1;

public class Unique 
{
public static int getUnique(int number)
{
	int count=0;
	int r1,r2,num1,num2;
	num1=number;
	num2=number;
	while(num1>0)
	{
		r1=num1%10;
	while(num2>0)
	{
		r2=num2%10;
	if(r1==r2)
	{
		count++;
	}
	num2=num2/10;
}
	num1=num1/10;
	}
	if(count ==1)
	{  
		System.out.println("The number is unique.");  
		return 1;
		}  
		else  
		{  
		System.out.println("The number is not unique.");  
		return -1;
		} 
		}
}
        
	
