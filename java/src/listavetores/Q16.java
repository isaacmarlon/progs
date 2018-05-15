package listavetores;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[4];
		int qntDif = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
		}
		
		for (int i = 0, j = 0; j < num.length; j++) {
			if (j == 0) {
				++qntDif;
			} else if ((num[i] != num[j])){
				for (int k = (j + 1); k < num.length; k++) {
					if (num[j] == num[k]) {
						--qntDif;
					}
				}
				++qntDif;
			}
		}
		
		int dif[] = new int[qntDif];
		
		for (int i = 0, j = 0, k = 0; k < dif.length; j++) {
			if (j == 0) {
				dif[k] = j;
				++k;
			} else if (num[i] != num[j]){
				dif[k] = j;
				++k;
			}
		}
		
		int num2[] = new int[qntDif];
		
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num[dif[i]];
		}
		
		System.out.println();
		
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("[%d]\n",num2[i]);
		}
		
		
	}
}
