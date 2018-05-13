package listavetores;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[10];
		
		for (int i = 0; i < v1.length; i++) {
			System.out.printf("%dº v1: ",(i + 1));
			v1[i] = read.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < v2.length; i++) {
			System.out.printf("%dº v2: ",(i + 1));
			v2[i] = read.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] * v2[i]; 
		}
		
		System.out.printf("\n(v1)\nÍndice\t\tValor\n\n");
		
		for (int i = 0; i < v1.length; i++) {
			System.out.printf("[%d]\t-\t%d\n",i,v1[i]);
		}
		
		System.out.printf("\n(v2)\nÍndice\t\tValor\n\n");
		
		for (int i = 0; i < v2.length; i++) {
			System.out.printf("[%d]\t-\t%d\n",i,v2[i]);
		}
		
		System.out.printf("\n(v3)\nÍndice\t\tValor\n\n");
		
		for (int i = 0; i < v3.length; i++) {
			System.out.printf("[%d]\t-\t%d\n",i,v3[i]);
		}
	}

}
