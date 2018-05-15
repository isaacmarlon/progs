package listavetores;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[4];
		int maior = 0, idx = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
			
			if (i == 0) {
				maior = num[i];
				idx = i;
			} else if (num[i] > maior) {
				maior = num[i];
				idx = i;
			}
		}
		
		
		System.out.printf("\n(MAIOR)\nÍndice\t\tValor\n\n");
		System.out.printf("[%d]\t-\t%d\n\n",idx,num[idx]);
		System.out.printf("(ÚLTIMO)\nÍndice\t\tValor\n");
		System.out.printf("[%d]\t-\t%d\n\n",(num.length - 1),(num[num.length - 1]));
		
		int troca = num[num.length - 1];
		num[num.length - 1] = maior;
		num[idx] = troca;
		
		System.out.printf("\n(TROCANDO...)\n\nÍndice\t\tValor\n\n");
		
		for (int j = 0; j < num.length; j++) {
			System.out.printf("[%d]\t-\t%d\n",j,num[j]);
		}		
	}

}
