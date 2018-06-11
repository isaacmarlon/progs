package listaFuncoes;

public class Q13 {

	public static void main(String[] args) {
		int[][] array01 = {{1,-2},{2,7}};
		printMainDiagonal(array01);
	}
	
	static void printMainDiagonal(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d]",array[i][i]);
		}
	}

}
