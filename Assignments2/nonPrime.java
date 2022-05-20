package com.te.Assignments2;

public class nonPrime 
{
public static int addNumbers(int num) 
{ 
		int sum = 0;//1
		int k = 0;
		 
		for (int i = 1; i <= num; i++) {//2/4
		k = 0;//1//2//3
		for (int j = 1; j <= i; j++) {//1//34
		if (i % j == 0)
		k++;//1//2/4
		}
		if (k != 2) {
		sum = sum + i;//1
		}
		}
		 
		return sum;
		}
		}
