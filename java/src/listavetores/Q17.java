package listavetores;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int a1[] = new int[4];
		int a2[] = new int[4];
		int a3[] = new int[8];
		
		for (int i = 0, pass = 1; pass != 3; i++) {
			if (pass == 1) {
				System.out.printf("%dº (a1): ", (i + 1));
				a1[i] = read.nextInt();
			} else {
				System.out.printf("%dº (a2): ", (i + 1));
				a2[i] = read.nextInt();
			}
			if (i == (a1.length - 1)) {
				++pass;
				i = -1;
				System.out.println();
			}
		}
		
		/*for (int i = 0, j = 0, k = 0; i < a1.length; j++) {
			if (j < a1.length) {
				a3[i] = a1[j];
				++i;
			} else { 
				a3[j] = a2[k];
				++k;
				++i;
			}
		}*/
		
		int doisVetores = a1.length;                              		
		int qntIguais = 0;
		
		for (int i = 0, j = 0; j < doisVetores; j++) {
			if ((a1[i] == a2[j])){
				/*for (int k = (j + 1); k < a1.length; k++) {
					if (a1[j] != a1[k]) {
						--qntIguais;
					}
				}*/
				++qntIguais;
			}
		}
		
		int iguais[] = new int[qntIguais];
		
		for (int i = 0, j = 0, k = 0; k < iguais.length; j++) {
			if (j == 0) {
				iguais[k] = j;
				++k;
			} else if (a1[i] != a1[j]){
				iguais[k] = j;
				++k;
			}
		}
		
		int ax[] = new int[qntIguais];
		
		for (int i = 0; i < ax.length; i++) {
			ax[i] = a1[iguais[i]];
		}
		
		System.out.println();
		
		for (int i = 0; i < ax.length; i++) {
			System.out.printf("[%d]\n",ax[i]);
		}
		
		
	}

}
