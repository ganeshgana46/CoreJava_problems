
public class ReverseString {

	public static void main(String[] args) {
		String str = "ganesh";
		StringBuffer print = new StringBuffer(str);
		
//		String revStr ="";
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr = revStr + str.charAt(i);
			System.out.println(print.reverse());
		}

	}


