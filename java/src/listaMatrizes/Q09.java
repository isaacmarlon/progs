package listaMatrizes;
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("m: ");
		int m = leia.nextInt();
		System.out.print("n: ");
		int n = leia.nextInt();
		
		int matriz[][] = new int[m][n];
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("matriz[%d][%d]: ",i,j);
				matriz[i][j] = leia.nextInt();
			}
		}
		
		// VERIFICAÇÃO LINHA NULA
		
		int linhasNulas = 0;
		
		for (int i = 0, zeros = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) ++zeros;
			}
			if (zeros == matriz[i].length)	++linhasNulas;
			zeros = 0;
		}
		
		// VERIFICAÇÃO COLUNA NULA
		
		int colunasNulas = 0;
		
		for (int i = 0, zeros = 0; i < n; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][i] == 0) ++zeros;
			}
			if (zeros == matriz.length)	++colunasNulas;
			zeros = 0;
		}
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d]",matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("\nA matriz tem %d linha(s) e %d coluna(s) nula(s).\n",linhasNulas,colunasNulas);
		
	}

}
