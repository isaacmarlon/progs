package exercicioStrings;

public class Q08 {

	public static void main(String[] args) {
		String a = "Aprender JAVA é muito bom!";
		String[] cadA = a.split(" ");
		for (int i = 0; i < cadA.length; i++) {
			System.out.printf("[%s]",cadA[i]);
		}
	}

}
