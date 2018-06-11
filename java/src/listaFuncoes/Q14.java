package listaFuncoes;

public class Q14 {

	public static void main(String[] args) {
		int[][] array01 = {{1,2,3},
						   {2,5,7},
						   {2,1,1}};
		int[] row = vectorRowIn(3,array01);
		printVectorInt(row);
	}
	
	static int[] vectorRowIn(int row,int[][] array) {
		int[] vector = new int[array[row - 1].length];
		for (int i = 0; i < array[row - 1].length; i++) { vector[i] = array[row - 1][i]; }
		return vector;
	}
	
	static void printVectorInt(int[] vector) {
		for (int i = 0; i < vector.length; i++) { System.out.printf("[%d]",vector[i]); }
	}

}
