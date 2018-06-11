package listaFuncoes;

public class Q09 {

	public static void main(String[] args) {
		double[] double01 = {2,5};
		System.out.println(findValuein(6,double01));
	}
	
	static boolean findValuein(double value, double[] vector) {
		for (int i = 0; i < vector.length; i++) { if (vector[i] == value) return true; }
		return false;
	}

}
