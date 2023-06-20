import java.math.BigDecimal;

public class Employee1 extends Person1 {
	private String title;
	private String employeeName;
	private char employeeGrade;
	private String salary;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSalary() {
		return salary;
	}
	public String toString() {
		return String.format(" Person Name : %s \n Email : %s \n PhoneNumber : %s \n Title : %s \n EmployeeName : %s \n EmployeeGrade : %c \n EmployeeSalary : %s \n",
				super.getName(),
				super.getEmail(),
				super.getPhoneNumber(),
				title,employeeName,employeeGrade,salary);
	}
	
		
		
	}


