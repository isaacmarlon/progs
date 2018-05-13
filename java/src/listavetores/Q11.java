package listavetores;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[20];
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
		}
		
		int troca1 = num[0];
		num[0] = num[num.length - 1];
		num[num.length - 1] = troca1;
		
		int troca2 = num[1];
		num[1] = num[num.length - 2];
		num[num.length - 2] = troca2;
		
		System.out.printf("\nÍndice\t\tValor\n\n");
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("[%d]\t-\t%d\n",i,num[i]);
		}
	}

}
