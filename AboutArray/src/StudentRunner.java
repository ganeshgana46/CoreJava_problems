
public class StudentRunner {

	public static void main(String[] args) {
		//int [] marks = {95,96,97};
		Student student = new Student("Laddu",95,96,97);
		
		int number = student.getNoOfMarks();
		System.out.println("The Number Of Marks : " + number);
		
		int sum = student.sumOfMarks();
		System.out.println("sum of marks : " + sum);
		
		int maxvalue = student.getMaxMark();
		System.out.println("Maximum : " + maxvalue);
		
		int minvalue = student.getMinMark();
		System.out.println("Minimum : " + minvalue);
		
		System.out.println(student);
		
		student.addMark(95);
		System.out.println(student);
		
		student.removeMark(1);
		System.out.println(student);
		
	}

}
