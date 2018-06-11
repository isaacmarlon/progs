package listaFuncoes;
import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Num 1: ");
		int numUser = read.nextInt();
		System.out.println(some(6,2));
		System.out.println(subtraia(6,2));
		System.out.println(multiplique(6,2));
		System.out.println(divida(6,2));
	}
	
	static double some(double a, double b) { return a + b; }
	static double subtraia(double a, double b) { return a - b; }
	static double multiplique(double a, double b) { return a * b; }
	static double divida(double a, double b) { return a/b; }
	
}
