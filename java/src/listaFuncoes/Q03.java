package listaFuncoes;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		System.out.printf("%.2f",areaCirculoRaio(4));
	}
	
	static double areaCirculoRaio(double raio) { return Math.PI * Math.pow(raio, 2); }
}
