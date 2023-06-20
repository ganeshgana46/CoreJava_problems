
public class ClassroomRunner {

	public static void main(String[] args) {
		//int [] marks = {97,98,99};
		Classroom student = new Classroom("Laddu",97,98,99);
		
		int number =student.getNoOfMarks();
		System.out.println("Number of marks : " + number);
		
		int sum = student.getSumOfMarks();
		System.out.println("Sum of marks : " + sum);
		
		int MaxMark = student.getMaxMark();
		System.out.println("Maximum mark : " + MaxMark);
		
		
		int MinMark = student.getMinMark();
		System.out.println("Minimum Mark : " + MinMark);
		
		System.out.println(student);
		
	}

}
