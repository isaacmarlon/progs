package listaFuncoes;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		System.out.printf("%.2f",perimetroCirculoRaio(4));
	}
	
	static double perimetroCirculoRaio(float raio) {
		return 2 * Math.PI * raio;
	}

}
