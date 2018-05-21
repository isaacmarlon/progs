package matrizes;
import java.util.Scanner;
import java.util.Random;

public class Matrizes {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		
		//System.out.println();
		
		while (true) {
			
			System.out.print("Ordem(A/B): ");
			int ordem = read.nextInt();
			
			
			/*System.out.println("(Ordem da matriz A)");
			System.out.print("m = ");
			int m = read.nextInt();
			System.out.print("n = ");
			int n = read.nextInt();
			
			System.out.println("(Ordem da matriz B)");
			System.out.print("p = ");
			int p = read.nextInt();
			System.out.print("q = ");
			int q = read.nextInt();*/
			
			//if (n == p) {
				
				//int a[][] = new int[m][n];
				//int b[][] = new int[p][q];
				int a[][] = new int[ordem][ordem];
				int b[][] = new int[ordem][ordem];
				
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						System.out.printf("a[%d][%d] = ",(i + 1),(j + 1));
						a[i][j] = read.nextInt();
						//a[i][j] = random.nextInt(3);
						//System.out.printf("b[%d][%d] = %d\n",(i + 1),(j + 1),a[i][j]);
					}
				}
				
				System.out.println();
				
				for (int i = 0;  i < b.length; i++) {
					for (int j = 0; j < b[i].length; j++) {
						System.out.printf("b[%d][%d] = ",(i + 1),(j + 1));
						b[i][j] = read.nextInt();
						//b[i][j] = random.nextInt(3);
						//System.out.printf("b[%d][%d] = %d\n",(i + 1),(j + 1),b[i][j]);
					}
				}
				
				
				// MULTIPLICAÇÃO
				
				//int ab[][] = new int[m][q];
				int ab[][] = new int[ordem][ordem];
				
				
				for (int i = 0; i < ab.length; i++) {
					for (int j = 0; j < ab.length; j++) {
						for (int k = 0; k < b.length; k++) {
							ab[i][j] += (a[i][k]) * (b[k][j]); 
						}
					}
				}
				
				System.out.println();
				
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						System.out.printf("[%d]",ab[i][j]);
					}
					System.out.println();
				}
				
	 		//} else {
			//	System.out.println("\nErro: != p.");
			//}
			
			System.out.println();
			
			ordem = 0;
		}
	}
	
}
