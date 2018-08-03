package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Idade: ");
		
		try {
		
			int idade = read.nextInt();
		
		}
		catch (InputMismatchException exception) {
		
			System.err.println("\nVocê deve inserir um inteiro.\n\n");
			
		}
		
		int[] numeroS = {1,2,3,4};
		
		for (int i = 0; i < 5; i++) {
			
			try {
			
				System.out.println(numeroS[i]);
			
			} 
			catch (ArrayIndexOutOfBoundsException exception) {
				
				System.err.printf("\nPosição impossível no vetor [%d]\n\n",i);
				
			}
		}
		
		int[][] numeros = {{1,2,3},{4,5,6}};
		
		for (int[] numeroL : numeros) {
			
			for (int numero : numeroL) {
			
				System.out.println(numero);
				
			}
			
		}
		
		System.out.println("Vou aparecer!");
		
	}
	
}
