package com.inhertence;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	Employee(int id ,String name, double salary){
		this.id =id;
		this.name=name;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("name of the employee is :"+name+", id is: "+id+", salary is: "+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	
	Manager(String name, int id, int salary ,int teamSize){
		super(id,name,salary);
		this.teamSize=teamSize;
	}
	
}
class Intern extends Employee{
	
	String PaidOrUnpaid;
	Intern(String name,int id,int salary ,String PaidOrUnpaid){
		super(id,name,salary);
		this.PaidOrUnpaid=PaidOrUnpaid;
	}
	
}
class Developer extends Employee{
	String ProgrammingLanguage;
	
	Developer(String name,int id,int salary,String language){
		super(id,name,salary);
		this.ProgrammingLanguage=language;
	}
	
	
}
public class EmployeeManagmentSystem {
	
	public static void main(String[] args) {
		
		Employee obj=new Manager("DileepMishra", 12, 25000, 8); 
		Employee obj2=new Intern("DileepMishra", 12, 25000, "paid"); 
		Employee obj3=new Developer("DileepMishra", 12, 25000, "C++"); 
		
		obj.displayDetails();
		obj2.displayDetails();
		obj3.displayDetails();
	}

}
