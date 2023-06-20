package inheritanceExercise;

public class Person extends Object {
	//state
	private String name;
	private String email;
	private String phnNumber;
	
	
	
	public Person(String name) {
		System.out.println("person constructer");
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhnNumber(String phnNummber) {
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber() {
		return phnNumber;
	}
	public String toString() {
		return String.format("Person name : %s,Person email : %s, Person PhnNumber : %s",name,email,phnNumber);
	}

}
