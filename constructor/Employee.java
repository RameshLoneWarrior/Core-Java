package com.te.constructor;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable,Cloneable
{
  private int empId;
  public Employee(int empId, String empName, int empAge) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAge = empAge;
}
private String empName;
  @Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
}
@Override
public int hashCode() {
	return Objects.hash(empAge, empId, empName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empAge == other.empAge && empId == other.empId && Objects.equals(empName, other.empName);
}
private int empAge;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}
@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}
