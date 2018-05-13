package listavetores;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int a1[] = new int[8];
		int a2[] = new int[8];
		
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("%dº num (A1): ",(i + 1));
			a1[i] = read.nextInt();
		}
		
		System.out.println();
		
		for (int j = 0; j < a2.length; j++) {
			System.out.printf("%dº num (A2): ",(j + 1));
			a2[j] = read.nextInt();
		}
		
		for (int k = 0, l = 0; k < a1.length; k++) {
			l = a1[k];
			a1[k] = a2[k];
			a2[k] = l;
		}
		
		System.out.printf("\n(A1)\nÍndice\t\tValor\n\n");
		
		for (int m = 0; m < a1.length; m++) {
			System.out.printf("[%d]\t-\t%d\n",m,a1[m]);
		}
		
		System.out.printf("\n(A2)\nÍndice\t\tValor\n\n");
		
		for (int n = 0; n < a2.length; n++) {
			System.out.printf("[%d]\t-\t%d\n",n,a2[n]);
		}
	}

}
