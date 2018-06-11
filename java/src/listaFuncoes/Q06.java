package listaFuncoes;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Num: ");
		int numUser = read.nextInt();
		System.out.printf("fatDe(%d) = %d",numUser,fatorialDe(numUser));
	}
	
	static int fatorialDe(int num) {
		int fat = 1;
		for (int i = 1; i <= num; i++) { 
			fat *= i; 
		}
		return fat;
	}
}
