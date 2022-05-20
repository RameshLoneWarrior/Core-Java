package com.te.Assignments2;

public class luckySum 
{
	public static int getLuckySum(int arg1,int arg2,int arg3)
	{
		int sum=0;
		
		if((arg1!=13)&&(arg2!=13)&&(arg3!=13))
		{
			sum=arg1+arg2+arg3;
		 } 
		else if((arg1==13)&&(arg2!=13)&&(arg3!=13)){
			sum=arg3;
		}
		else if((arg1!=13)&&(arg2==13)&&(arg3!=13)) {
		 sum=arg1;
	}
	else if((arg1!=13)&&(arg2!=13)&&(arg3==13)) {
		sum=arg1+arg2;
	}
		return sum;

}
}