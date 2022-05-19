package com.te.assignments1;

public class UserMaincode 
{
 public static int checkSum(int num)
 {
	 int sum=0;
	
	 while(num>0)
	 {
		 int rem=num%10;
		 sum=sum+rem;
		 num=num/10;
	 }	
	 System.out.println("The sum of digits is " + sum);
     int temp=sum;
     if(temp%2==0)
     {
    	 System.out.println("The given number is even");
    	 return -1;
     }
     else
     {
    	 System.out.println("The given number is odd");
    	 return 1;
     }
 }
}
