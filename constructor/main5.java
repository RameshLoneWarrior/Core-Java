package com.te.constructor; 

public class main5 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
    Employee employee = new Employee(100, "Sam", 25);
    System.out.println(" Employee hash : " + employee.hashCode());
    System.out.println("Employee :" + employee);
    Employee employee2 = new Employee(120, "Hari", 30);
    System.out.println("Employee hash : " + employee2.hashCode());
    System.out.println("Employee :" + employee2);
    Employee employee3 = new Employee(121, "Zakir",25);
    System.out.println("Employee :" + employee3);
    System.out.println("Employee hash : " + employee2.hashCode());
    System.out.println();
    if(employee.equals(employee2))
    {
    	System.out.println("bBoth objects are same");
    }
    else
    {
    	System.out.println("Both objects are not same");
    }
    Employee employee4=(Employee) employee2.clone();
    System.out.println("Employee " + employee4);
	}
    
}
