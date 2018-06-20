package metodos;

public class Main {
	
	static void lala(int[] lala) {
		lala[0] = 2; 
	}

	public static void main(String[] args) {
		System.out.println(Operacoes.contador(2, 4));
		System.out.println(Operacoes.soma(2, 4));
		System.out.println(Operacoes.subtracao(10,5));
		System.out.println(Operacoes.multiplicacao(20,2));
		System.out.println(Operacoes.divisao(3, 2));
		
		int[] lele = new int[2];
	}
	
}
