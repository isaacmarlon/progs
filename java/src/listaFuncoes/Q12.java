package listaFuncoes;

public class Q12 {

	public static void main(String[] args) {
		int[][] array01 = {{1,3},{2,0}};
		System.out.printf("majorValue = %d\n",majorValueIn(array01));
	}
	
	static int majorValueIn(int[][] array) {
		int major = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == 0) major = array[i][j];
				else if (array[i][j] > major) major = array[i][j];
			}
		}
		return major;
	}

}
