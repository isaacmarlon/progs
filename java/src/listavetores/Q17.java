package listavetores;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int a1[] = new int[4];
		int a2[] = new int[4];
		int a3[] = new int[4];
		
		for (int i = 0, pass = 1; pass != 3; i++) {
			if (pass == 1) {
				System.out.printf("\n%d (a1): ", (i + 1));
				a1[i] = read.nextInt();
			} else {
				System.out.printf("\n%d (a2): ", (i + 1));
				a2[i] = read.nextInt();
			}
			
			if (i == (a1.length - 1)) {
				++pass;
				i = -1;
			}
		}
		
		for (int i = 0, j = 0; i < a1.length; i++) {
			if (a1[i] == a2[i]) {
				a3[j] = a1[i];
			}
			else if (){
				
			}
		}
	}

}
