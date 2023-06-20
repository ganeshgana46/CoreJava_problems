package gana83;

public class Ex01 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.b=12;
		t1.h=14;
		System.out.println("Area of T1 is"+t1.area());
	}

}

class Triangle{
	int h;
	int b;
	
	double area() {
		return 0.5*b*h;

}
}
