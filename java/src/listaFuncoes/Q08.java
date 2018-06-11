package listaFuncoes;

public class Q08 {

	public static void main(String[] args) {
		String[] string01 = {"Aa","Bb"};
		printVectorString(string01);
	}
	
	static void printVectorString(String[] vector) {
		for (int i = (vector.length - 1); i >= 0; i--) { System.out.printf("[%s]",vector[i]); }
	}

}
