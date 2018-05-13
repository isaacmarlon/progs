package listavetores;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[4];
		int qntPares = 0;
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
			
			if (num[i] % 2 == 0) {
				qntPares++;
			}
		}
		
		System.out.printf("\nQnt. pares = %d ",qntPares);	
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.printf("num[%d] = %d\n",i,num[i]);
			}
		}
	} 	
}
