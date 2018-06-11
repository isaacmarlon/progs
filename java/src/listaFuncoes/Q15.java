package listaFuncoes;

public class Q15 {

	public static void main(String[] args) {
		String[][] string01 = {{"Aa","Bb"},
				   			   {"Cc","Dd"}};
		printMainDiagonal(string01);
	}
	
	static void printMainDiagonal(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%s]",array[i][i]);
		}
	}
	
}
