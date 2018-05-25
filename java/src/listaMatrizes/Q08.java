package listaMatrizes;
import java.util.Scanner;
import java.util.Random;

public class Q08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		final int ORDEM = 6;
		
		//String m[][] = new String[ORDEM][ORDEM];
		int m[][] = new int[ORDEM][ORDEM];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
            	//System.out.printf("m[%d][%d]: ",i,j);
            	//m[i][j] = leia.nextLine();
                m[i][j] = random.nextInt(4);
                System.out.printf("m[%d][%d]: %d\n",i,j,m[i][j]);
			}
		}
		
		System.out.println("\nm[][]:");
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%d]",m[i][j]);
			}
			System.out.println();
		}
		
		
		// LINHAS PARES
		
		int linhasPares[] = new int[ORDEM * (ORDEM/2)]; 
		
		for (int iMatriz = 1, iVetor = 0; iMatriz < m.length; iMatriz += 2) {
			for (int j = 0; j < m[iMatriz].length; j++) {
				linhasPares[iVetor] = m[iMatriz][j];
				++iVetor;
			}
		}
		
		System.out.println("\nlinhasPares:");
		for (int i = 0; i < linhasPares.length; i++) {
			System.out.printf("[%d]",linhasPares[i]);
		}
		
		// DIAGONAL PRINCIPAL
		
		int diagonalPrincipal[] = new int[ORDEM];
		
		for (int i = 0, iVetor = 0; i < m.length; i++) {
			diagonalPrincipal[iVetor] = m[i][i];
			++iVetor;
		}
		
		System.out.println("\n\ndiagonalPrincipal:");
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			System.out.printf("[%d]",diagonalPrincipal[i]);
		}
		
		
		
	}

}
