
public class ReverseString {
	public static void main(String[] args) {
		String orignalString = "ganesh";
		String reverseString ="";
		for(int i=orignalString.length()-1;i>=0;i--) {
			reverseString = reverseString + orignalString.charAt(i);
			System.out.println(reverseString);
		}
	}
}




