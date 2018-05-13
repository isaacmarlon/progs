package listavetores;
import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[10];
		int maior = 0, menor = 0, idxMaior = 0, idxMenor = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
			
			if (i == 0) {
				idxMaior = i;
				idxMenor = i;
				maior = num[i];
				menor = maior;
			} 
			else if (num[i] > maior) {
				idxMaior = i;
				menor = maior;
				maior = num[i];
			} 
			else if (num[i] < menor) {
				menor = num[i];
				idxMenor = i;
			}
		}
		
		System.out.printf("\n(MAIOR)\nÍndice: %d \nValor = %d\n",idxMaior,num[idxMaior]);
		System.out.printf("\n(MENOR)\nÍndice: %d \nValor = %d\n",idxMenor,num[idxMenor]);
	}

}
