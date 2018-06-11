package listaFuncoes;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Num: ");
		int numUser = read.nextInt();
		System.out.println(ehPrimo(qntDivisores(numUser)));
	}
	
	static int qntDivisores(int num) {
		int qntDiv = 0;
		for (int i = 1; i <= num; i++) { if (num%i == 0) ++qntDiv; }
		return qntDiv;
	}

	static boolean ehPrimo(int qntDivisores) {
		return (qntDivisores <= 2);
	}
}
