
public class HelloWorld {
	
	public void sayHelloWorld(int number) {
		for(int i=1;i<=number;i++) {
		System.out.println("Hello Fake World!");
		}
	}

	public static void main(String[] args) {
		HelloWorld print = new HelloWorld();
		print.sayHelloWorld(3);

	}

}
