package exercicioStrings;

public class Q05 {

	public static void main(String[] args) {
		String a = "ABRACADABRA";
		String b = a.substring(a.indexOf("C"),(a.indexOf("C") + 4));
		System.out.println(b);
	}

}
