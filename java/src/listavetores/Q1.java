package listavetores;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: ",(i + 1));
			num[i] = read.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº num: %d\n",(i + 1),num[i]);
		}
	}

}
