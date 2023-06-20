

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student person = new Student();
		person.setName("Gana");
		System.out.println(person.getName());
		person.setEmail("pallamganesh213@gmail.com");
		System.out.println(person.getEmail());
		person.setPhoneNumber("8296096782");
		System.out.println(person.getPhoneNumber());
		person.setClgName("veltech");
		System.out.println(person.getClgName());
		person.setYear("2019");
		System.out.println(person.getYear());
		String gogo = person.toString();
		System.out.println(gogo);

	}

}
