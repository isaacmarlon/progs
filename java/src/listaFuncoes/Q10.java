package listaFuncoes;

public class Q10 {

	public static void main(String[] args) {
		double[] double01 = {2,5};
		System.out.printf("pos: %d",findValueIn(5,double01));
	}
	
	static int findValueIn(double value, double[] vector) {
		for (int i = 0; i < vector.length; i++) { if (vector[i] == value) return i; }
		return -1;
	}
}
