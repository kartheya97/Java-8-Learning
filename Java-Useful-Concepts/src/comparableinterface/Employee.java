package comparableinterface;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	public static void main(String[] args) {
		
		Employee employee[] = new Employee[5];
		employee[0]         = new Employee(5,"John");
		employee[1]         = new Employee(2,"Sai");
		employee[2]         = new Employee(1,"Raju");
		employee[3]         = new Employee(7,"Amit");
		employee[4]         = new Employee(3,"Sheru");
		
		Arrays.sort(employee);
		System.out.println("Sorted = "+Arrays.toString(employee));
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return Integer.compare(this.employeeId, emp.employeeId);
		//return this.employeeId - emp.employeeId;
	}
}
