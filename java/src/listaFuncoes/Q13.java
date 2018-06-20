package listaFuncoes;

public class Q13 {

	public static void main(String[] args) {
		int[][] array01 = {{1,2,1},
						   {2,7,1},
						   {1,2,3}};
		System.out.println(someUpDiagonal(array01));
	}
	
	static int someUpDiagonal(int[][] array) {
		int some = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array[i].length; j++) {
				some += array[i][j];
			}
		}
		return some;
	}
	
	static void printMainDiagonal(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d]",array[i][i]);
		}
	}

}
