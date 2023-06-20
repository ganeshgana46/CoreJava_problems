import java.util.ArrayList;

public class Classroom {
	private String name;
	private int[] marks;
	
	public Classroom(String name,int...marks){
		this.name = name;
		this.marks = marks;
	}
	
	public int getNoOfMarks() {
		return marks.length;
	}
	
	public int getSumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum = sum + mark;
		}
		return sum;
	}
	
	public int getMaxMark() {
		int max = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark> max) {
				max = mark;
			}
		}
		return max;
	}
	
	public int getMinMark() {
		int min = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<min) {
				min = mark;
			}
		}
		return min;
	}
	
	public String toString() {
		return name + marks;
	}
	


}
