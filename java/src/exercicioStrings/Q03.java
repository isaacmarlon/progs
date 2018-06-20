package exercicioStrings;

import metodos.Main;

public class Q03 {
	public static void main(String[] args) {
		String palavra = "ABRACADABRA";
		for (int i = (palavra.length() - 1); i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}
}
