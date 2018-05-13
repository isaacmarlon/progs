package listavetores;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[20];
		int maiorDif = 0, idxDif = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ", (i + 1));
			num[i] = read.nextInt();
		}
		
		for (int i = 0, j = 0; i < num.length; i++) {
			if (i == 0) {
				maiorDif = (num[i] - num[i + 1]);
				idxDif = i;
			} 
			else if (num[j] < num.length - 1) {
				if ((num[j] - num[j + 1]) > maiorDif) {
					maiorDif = (num[j] - num[j + 1]);
					idxDif = j;
				}
				++j;
			}
		}
		
		System.out.printf("\nMaior dif: %d\n", maiorDif);
		System.out.printf("\nÍndice\t\tValor\n\n");
		System.out.printf("[%d]\t-\t%d\n",idxDif,num[idxDif]);
		System.out.printf("[%d]\t-\t%d\n",(idxDif + 1),num[(idxDif + 1)]);
	}

}
