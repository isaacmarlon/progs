package strings;

public class conc {
	public static void main(String[] args) {
		String b = "";
		System.out.println(b);
		String a = " Java ";
		
		// concatenando
		
		a += "é ";
		a = a.concat("legal");
		System.out.println(a);
		
		// length()
		
		System.out.println(a.length());
		
		// charAt(index)
		
		System.out.println(a.charAt(2));
		
		// toCharArray
		
		char[] charA = a.toCharArray();
		
		for (int i = 0; i < charA.length; i++) {
			System.out.printf("%s-",charA[i]);
		}
		System.out.println();
		
		// toUpperCase
	
		System.out.println(a.toUpperCase());
		
		// toLowerCase
		
		System.out.println(a.toLowerCase());
		
		// trim()
		
		System.out.println(a.trim());
		
		// compareTo()
		
		System.out.println(a.compareTo(b));
	}
}
