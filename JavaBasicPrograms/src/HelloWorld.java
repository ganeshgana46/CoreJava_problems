
public class HelloWorld {
	public void sayHelloWorld(int number) {
		for(int i=1; i<=number; i++) {
		System.out.println("Hello World!");
		}
	}


public static void main(String[] args) {
	HelloWorld say = new HelloWorld();
	say.sayHelloWorld(4);
	
}
}