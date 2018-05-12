package listavetores;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[10];
		int maior = 0, idx = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
			
			if (i == 0) {
				maior = num[i];
				idx = i;
			}
			else if (num[i] > maior) {
				maior = num[i];
				idx = i;
			}
		}
		
		System.out.printf("\nÍndice: %d \nValor = %d\n",idx,num[idx]);
	}

}
