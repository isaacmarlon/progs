package listaFuncoes;

public class Q11 {

	public static void main(String[] args) {
		String[][] string01 = {{"Aa","Bb"},
							   {"Cc","Dd"}};
		printArrayString(string01);
	}
	
	static void printArrayString(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%s]",array[i][j]);
			}
			System.out.println(); 
		}
	}
}
