package compartorinterface;

import java.util.Arrays;
import java.util.Comparator;

public class Employee   {

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
		
		//(e1,e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName();
		Comparator<Employee> employeeCompartor = Comparator.comparing(Employee::getEmployeeName);
		Arrays.sort(employee,employeeCompartor);
		System.out.println("Sorted Based On Name:"+Arrays.toString(employee));
	}

	
	

	
}
