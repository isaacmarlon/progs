package listavetores;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num[] = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dª num: ",(i + 1));
			num[i] = read.nextInt();
		}
		
		System.out.println();
		
		for (int i = (num.length - 1); i >= 0; i--) {
			System.out.printf("%dº num: %d\n",(i + 1),num[i]);
		}
		
	}

}
