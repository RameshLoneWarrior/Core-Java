package com.te.day2assignments;

public class way_1 
{
int id;
String name;
double sal;
float phnumber;
public void employeeData() 
{
int id;
String name;
double sal;
long phnumber;
}
way_1(int id,String name,double sal,long phnumber)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
	this.phnumber=phnumber;
}
way_1(int id, String name,double sal)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
}
void display() {
	System.out.println("Employee ID = " + id);
	System.out.println("Employee name = " + name);
	System.out.println("Employee  = " + sal);
	System.out.println("Employee phnumber = " + phnumber);
}
public static void main(String[]args)
{
	System.out.println("**************");
    way_1 emp= new way_1(1234, "Ramesh", 10000.0,8939203134l);
    emp.display();
    way_1 emp2=new way_1(1235, "Hariharan",20000.0);
    emp2.display();
    System.out.println("**************");
}
}
