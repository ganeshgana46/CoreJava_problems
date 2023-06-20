package inheritanceExercise;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee employee = new Employee("laddu","App developer");
		
		//employee.setName("Laddu");
		//employee.setEmail("laddu@gmail.com");
		employee.setPhnNumber("8296096782");
		employee.setTitle("App developer");
		employee.setEmployerName("Laddu");
		employee.setEmployeeGrade('A');
		employee.setEmployeeSalary("50,000");
		System.out.println(employee);

	}

}
