package listavetores;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int bucho[] = {10,8,6,3};
		
		System.out.print("Valor = ");
		int valor = read.nextInt();
		
		for (int i = 0; i < bucho.length; i++) {
			if (bucho[i] == valor) {
				System.out.printf("\nValor %d encontrado em bucho[%d]!\n",valor,i);
				break;
			} else if (i == (bucho.length - 1)) {
				System.out.printf("\nValor %d não foi encontrado.\n",valor);
			}
		}
	}

}
