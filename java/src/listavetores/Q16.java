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
			if ((num[i] == (num[j]) && (j == 0))) {
				++qntDif;
			} else if (num[i] != num[j]){
				++qntDif;
			}
		}
		
		int num2[] = new int[qntDif];
		
		for (int i = 0, j = 0; j < num2.length; j++) {
			if (num[i] != num[j]) {
				num2[i] = num[j];
				++i;
			}
		}
		
		System.out.printf("\nQnt. dif: %d,\n\nÍndice\t\tValor\n\n",qntDif);
		
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("[%d]\t-\t%d\n",i,num2[i]);
		}
		
		
	}
}
