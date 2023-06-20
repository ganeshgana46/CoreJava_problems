import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	private String name;
	//private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	public Student(String name,int... marks) {
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	public int getNoOfMarks() {
		//return marks.length;
		return marks.size();
	}
	public int sumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum = sum + mark;
		}
		return sum;
	}
	public int getMaxMark() {
//		int max = Integer.MIN_VALUE;
//		for(int mark:marks) {
//			if(mark > max) {
//				max = mark;
//			}
//		}
		return Collections.max(marks);
	}
	public int getMinMark() {
//		int min = Integer.MAX_VALUE;
//		for(int mark:marks) {
//			if(mark < min) {
//				min = mark;
//			}
//		}
		return Collections.min(marks);
	}
	public String toString() {
		return name+marks;
	}
	public void addMark(int mark) {
		marks.add(mark);
	}
	public void removeMark(int mark) {
		marks.remove(mark);
	}

}
