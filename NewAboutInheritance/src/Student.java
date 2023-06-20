
public class Student extends Person {
	private String clgName;
	private String year;
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
		return String.format("Name : %s,Email : %s,PhoneNumber : %s,CollegeName : %s,Year : %s",
				super.getName(),
				super.getEmail(),
				super.getPhoneNumber(),
				clgName,year);
	}
	
}



