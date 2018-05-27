package listaMatrizes;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int LINHAS = 5;
		final int COLUNAS = 7;
		
		float m[][] = new float[LINHAS][COLUNAS];
		
		// LEITURA DA MATRIZ
		
		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				System.out.printf("m[%d][%d]: ",i,j);
				m[i][j] = leia.nextFloat();
			}
			System.out.println();
		}
		
		// MAIORES ELEMENTOS DAS LINHAS
		
		float maioresLinha[] = new float[LINHAS];
		
		for (int i = 0, j = 0; i < LINHAS; i++) {
			for (int k = 0; k < COLUNAS; k++) {
				if (k == 0) maioresLinha[j] = m[i][k];
				else if (m[i][k] > maioresLinha[j])	maioresLinha[j] = m[i][k];
			}
			++j;
		}
		
		// MAIORES ELEMENTOS DAS COLUNAS
		
		float maioresColunas[] = new float[COLUNAS];
		
		for (int i = 0, j = 0; i < COLUNAS; i++) {
			for (int k = 0; k < LINHAS; k++) {
				if (k == 0)	maioresColunas[j] = m[k][i];
				else if (m[k][i] > maioresColunas[j]) maioresColunas[j] = m[k][i];
			}
			++j;
		}
		
		// IMPRIMINDO MATRIZ
		
		System.out.println("m:");
		
		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				System.out.printf("[%.2f]",m[i][j]);
			}
			System.out.println();
		}
		
		// IMPRIMINDO MAIORES ELEMENTOS DAS LINHAS
		
		System.out.println("\nmaioresLinha:");
		
		for (int i = 0; i < maioresLinha.length; i++) {
			System.out.printf("[%.2f]",maioresLinha[i]);
		}
		
		// IMPRIMINDO MAIORES ELEMENTOS DAS COLUNAS
		
		System.out.println("\n\nmaioresColunas:");
		
		for (int i = 0; i < maioresColunas.length; i++) {
			System.out.printf("[%.2f]",maioresColunas[i]);
		}
		
		// SOMA DAS COLUNAS
		
		float somaColunas[] = new float[COLUNAS];
		
		for (int i = 0, j = 0; i < COLUNAS; i++) {
			for (int k = 0; k < LINHAS; k++) {
				somaColunas[j] += m[k][i];
			}
			++j;
		}
		
		// IMPRIMINDO SOMA DAS COLUNAS
		
		System.out.println("\n\nsomaColunas:");
		
		for (int i = 0; i < COLUNAS; i++) {
			System.out.printf("[%.2f]", somaColunas[i]);
		}
		
		// PRODUTO
		
		float produto = 1;
		
		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				if (m[i][j] != 0) produto *= m[i][j];
			}
		}
		
		int qntNegativos = 0;
		
		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				if (m[i][j] < 0) ++qntNegativos;
			}
		}
		
		
		System.out.printf("\n\nProduto: %.2f\n",produto);
		System.out.printf("qntNegativos: %d\n",qntNegativos);
	}

}
