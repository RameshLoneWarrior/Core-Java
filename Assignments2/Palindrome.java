package com.te.Assignments2;

public class Palindrome 
{
public static int addPalindromes(int num1,int num2)
{
int sum = 0;
for (int i = num1; i <= num2; i++) {
int r = 0, n3 = i;
while (n3 != 0) {
r = (r * 10) + (n3 % 10);
n3 = n3 / 10;
}
// System.out.println(n3);
if (r == i)
sum = sum + i;
}
return sum;
}
}
	   
