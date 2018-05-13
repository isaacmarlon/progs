package listavetores;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[4];
		int qnt = 0, c = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
			
			for (int j = 0; j < num.length; j++) {
				if (num[i] == (num[j])) {
					c++;
				}
			}
		}
		
		
	}
}
