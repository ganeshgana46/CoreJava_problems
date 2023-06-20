/*Inheritance : It acquire properties from one class to another class.
  Types of Inheritance:
  1)single inheritance
  2)multilevel inheritance
  3)hierarchical inheritance
  4)multiple inheritance
  5)hybrid inheritance
 */
class Animal{
	
	void bark() {
		System.out.println("same color");
	}
}
class Dog extends Animal{
	
	void sleep() {
		System.out.println("same ears");
	}
}
class TestInheritance{
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
		obj.sleep();
	}
}
