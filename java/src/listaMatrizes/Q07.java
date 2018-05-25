package listaMatrizes;
import java.util.Scanner;
//import java.util.Random;

public class Q07 {
 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Random random = new Random();
        
        final int ORDEM = 2;
        
        int a[][] = new int[ORDEM][ORDEM];
        int b[][] = new int[ORDEM][ORDEM];
        int ab[][] = new int[ORDEM][ORDEM];
        
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            	System.out.printf("a[%d][%d]: ",i,j);
            	a[i][j] = leia.nextInt();
                /*a[i][j] = random.nextInt(4);
                System.out.printf("a[%d][%d]: %d\n",i,j,a[i][j]);*/
            }
        }
        
        System.out.println();
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
            	System.out.printf("b[%d][%d]: ",i,j);
            	b[i][j] = leia.nextInt();
                /*b[i][j] = random.nextInt(3);
                System.out.printf("b[%d][%d]: %d\n",i,j,b[i][j]);*/
            }
        }
        
        System.out.println();
        
        // !!
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("[%d]",a[i][j]);
			}
			System.out.println();
		}
        
        System.out.println(" - ");
        
        // !!
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("[%d]",b[i][j]);
			}
			System.out.println();
		}
        
        
        // SOMA DAS MATRIZES QUADRADAS DE ORDEM 5
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                ab[i][j] = a[i][j] - b[i][j];
            }
        }
        
        System.out.println(" = ");
        
        for (int i = 0; i < ab.length; i++) {
        	for (int j = 0; j < ab[i].length; j++) {
        		System.out.printf("[%d]",ab[i][j]);
			}
        	System.out.println();
		}
    }
    
}