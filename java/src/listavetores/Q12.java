package listavetores;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int a1[] = new int[10];
		int a2[] = new int[10];
		
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("%dº num: ", (i + 1));
			a1[i] = read.nextInt();
			a2[i] = (int) (Math.pow((a1[i]),3));
		}
		
		System.out.printf("\n(A2)\nÍndice\t\tValor\n\n");
		
		for (int j = 0; j < a2.length; j++) {
			System.out.printf("[%d]\t-\t%d\n",j,a2[j]);
		}
	}

}
