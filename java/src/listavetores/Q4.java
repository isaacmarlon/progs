package listavetores;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float nota[] = new float[30];
		float soma = 0;
		
		for (int i = 0; i < nota.length; i++) {
			System.out.printf("%dª nota: ",(i + 1));
			nota[i] = read.nextFloat();
			soma += nota[i];
		}
		
		float media = (float)(soma/nota.length);
		System.out.printf("\nMédia = %.2f\n",media);
		System.out.println();
		
		for (int i = 0, j = 0, qntAcima = 0; j < nota.length;) {
			if ((nota[i] >= media)) {
				++qntAcima;
			}
			if (i < (nota.length - 1)) {
				i++;
			} else {
				if (j == 0) {
					System.out.println("Qnt. acima = " + qntAcima);
					System.out.println();
				}
				if (nota[j] >= media) {
					System.out.printf("%dª nota = %.2f\n",(j + 1),nota[j]);
				}
				j++;
			}
		}
	}
}
