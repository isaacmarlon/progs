package listaMatrizes;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		final int ORDEM = 2;
		
		String m[][] = new String[ORDEM][ORDEM];
	
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
            	System.out.printf("m[%d][%d]: ",i,j);
            	m[i][j] = leia.nextLine();
			}
		}
		
		System.out.println("\nm[][]:");
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%s]",m[i][j]);
			}
			System.out.println();
		}
		
		
		// LINHAS PARES
		
		String linhasPares[] = new String[ORDEM * (ORDEM/2)]; 
		
		for (int iMatriz = 1, iVetor = 0; iMatriz < m.length; iMatriz += 2) {
			for (int j = 0; j < m[iMatriz].length; j++) {
				linhasPares[iVetor] = m[iMatriz][j];
				++iVetor;
			}
		}
		
		System.out.println("\nlinhasPares:");
		for (int i = 0; i < linhasPares.length; i++) {
			System.out.printf("[%s]",linhasPares[i]);
		}
		
		// DIAGONAL PRINCIPAL
		
		String diagonalPrincipal[] = new String[ORDEM];
		
		for (int i = 0, iVetor = 0; i < m.length; i++) {
			diagonalPrincipal[iVetor] = m[i][i];
			++iVetor;
		}
		
		System.out.println("\n\ndiagonalPrincipal:");
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			System.out.printf("[%s]",diagonalPrincipal[i]);
		}
	}

}
