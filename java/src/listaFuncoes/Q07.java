package listaFuncoes;

public class Q07 {

	public static void main(String[] args) {
		char[] char01 = {'A','B'};
		printVectorChar(char01);
	}
	
	static void printVectorChar(char[] vector) {
		for (int i = 0; i < vector.length; i++) { System.out.printf("[%s]",vector[i]); }
	}

}
