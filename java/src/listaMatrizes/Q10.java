package listaMatrizes;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float m[][] = new float[2][4];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]: ",i,j);
				m[i][j] = leia.nextFloat();
			}
		}
		
		float maiores[] = new float[m.length];
		
		for (int i = 0, j = 0; i < m.length; i++) {
			for (int k = 0; k < m[i].length; k++) {
				if (i == 0) maiores[j] = m[i][k];
				else if (m[i][k] > maiores[j])	maiores[j] = m[i][k];
			}
		}
	}

}
