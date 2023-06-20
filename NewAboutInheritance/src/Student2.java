
public class Student2 extends Person2 {
	private String clgName;
	private String year;
	
	public Student2(String name,String Email,String phoneNumber,String clgName, String year) {
		super(name);
		this.Email = Email;
		this.phoneNumber = phoneNumber;
		this.clgName = clgName;
		this.year = year;
		
		
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String toString() {
		return String.format("Name : %s \n,Email : %s,PhoneNumber : %s,CollegeName : %s,Year : %s",
				super.getName(),
				super.getEmail(),
				super.getPhoneNumber(),
				clgName,year);
	}

}
