package matrizes;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class SpecialsMatrix {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		
		int qntIguais = 0, qntComutativas = 0;
		int qntMatrizes = 100;
		int qntMedia = 100;
		
		System.out.println("Ordem quadrática: ");
		int order = read.nextInt();
		
		int a[][] = new int[order][order];
		int b[][] = new int[order][order];
		int ab[][] = new int[order][order];
		int ba[][] = new int[order][order];
		
		for (int vezes = 1; vezes <= qntMedia; vezes ++)
		for (int times = 1; times <= qntMatrizes; times++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = random.nextInt(2);
				}
			}
			
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					b[i][j] = random.nextInt(2);
				}
			}
			
			// AB
			
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					for (int k = 0; k < b.length; k++) {
						ab[i][j] += a[j][k] * b[k][j];
					}
				}
			}
			
			// BA
			
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					for (int k = 0; k < b.length; k++) {
						ba[i][j] += b[j][k] * a[k][j];
					}
				}
			}
			
			for (int i = 0; i < ab.length; i++) {
				for (int j = 0; j < ba.length; j++) {
					if(ab[i][j] == ba[i][j]) {
						++qntIguais;
					}
				}
			}
			
			if (qntIguais == 4) {
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						System.out.printf("[%d]",a[i][j]);
					}
					System.out.println();
				}
				System.out.println("*");
				for (int i = 0; i < b.length; i++) {
					for (int j = 0; j < b.length; j++) {
						System.out.printf("[%d]",b[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				++qntComutativas;
				qntIguais = 0;
			}
		}
		
		System.out.println("(Quantidade de matrizes comutativas)");
		System.out.printf("Em média %.2f de %d.",((float) qntComutativas/(float) qntMedia),(qntMatrizes * 2));
	}

}
