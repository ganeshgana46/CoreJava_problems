package gana85;

public class Ex03 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.b=12;
		t1.h=14;
		Triangle t2 = new Triangle();
		t2.b=12;
		t2.h=14;
		System.out.println("Area of "+t1+" is"+t1.area());
		System.out.println("Area of "+t1+" is"+t2.area());
	}

}

class Triangle{
	int h;
	int b;
	
	double area() {
		return 0.5*b*h;
	}
	public String toString() {
		return "Triangle{" +
	"h=" +h+
	", b=" +b+
	'}';

}
}