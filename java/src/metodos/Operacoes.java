package metodos;

public class Operacoes {
	
	// MATEMÁTICAS
	
	public static int soma(int a, int b) { return a + b; }
	public static int subtracao(int a, int b) { return a - b; }
	public static int multiplicacao(int a, int b) { return a * b; }
	public static float divisao(int a, int b) { return ((float) a/(float) b); }
	
	// FERRAMENTAS
	
	public static String contador(int inicio, int fim) {
		String c = "";
		for (int i = inicio; i <= fim; i++) { c += i + " "; }
		return(c);
	}
}
