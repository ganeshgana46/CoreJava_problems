package inheritanceExercise;

public class Employee extends Person {
	//state
	private String title;
	private String employerName;
	private char employeeGrade;
	private String employeeSalary;
	
	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("employee constructor");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String toString() {
		return String.format("employee title : %s,employer name : %s,employeegrade : %c, employee salary : %s",title,employerName,employeeGrade,employeeSalary);
	}
}
