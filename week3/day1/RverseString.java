package week3.day1;

public class RverseString {

	public static void main(String[] args) {
		String name ="Testleaf";
		
		char[] ch =name.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.println(ch[i]);
			
		}
		
		
	}

}
