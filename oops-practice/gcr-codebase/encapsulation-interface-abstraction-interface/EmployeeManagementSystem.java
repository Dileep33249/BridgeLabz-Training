package abstract_polymorphism;
import java.util.*;

//interface for assigning department details
interface Department{

	public abstract void assignDepartment(String departmentName);
	public abstract String getDepartmentDetails();


}

abstract class Employee implements Department {

    private int id;
    private String name;
    protected String departmentName;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
  // abstarct calculate method
    public abstract double calculateSalary();

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return departmentName;
    }

    public void displayDetails() {
        System.out.println(
            "Employee id: " + id +
            ", Name: " + name +
            ", Department: " + departmentName +
            ", Salary: " + calculateSalary()
        );
    }
}


class FullTimeEmployee extends Employee{
      
	int workingHours;
	int perHourRate;
	
	FullTimeEmployee(String name,int id ,int workingHours,int perHourRate){
		super(id,name);
		this.workingHours=workingHours;
		this.perHourRate=perHourRate;
	}
	@Override
	public double calculateSalary() {
		return workingHours * perHourRate;
	}	
}

class PartTimeEmployee extends Employee{
	
	int workingHours;
	int perHourRate;
	
	PartTimeEmployee(String name,int id ,int workingHours,int perHourRate){
		super(id,name);
		this.workingHours=workingHours;
		this.perHourRate=perHourRate;
	}
	@Override 
	public double calculateSalary() {
		return workingHours * perHourRate;
	}
}
public class EmployeeManagementSystem {
  public static void main(String [] args) {

		        ArrayList<Employee> employees = new ArrayList<>();

		        Employee e1 = new FullTimeEmployee("Dileep", 101, 160, 500);
		        e1.assignDepartment("IT");

		        Employee e2 = new PartTimeEmployee("Rahul", 102, 80, 400);
		        e2.assignDepartment("HR");

		        employees.add(e1);
		        employees.add(e2);

		        for (Employee emp : employees) {
		            emp.displayDetails();
		        }
		    }
}

