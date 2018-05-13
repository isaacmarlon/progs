package listavetores;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Qnt. lançamentos: ");
		int qLcts = read.nextInt();
		
		int re[] = new int[qLcts];
		
		for (int i = 0; i < re.length; i++) {
			System.out.printf("%dº Resultado: ",(i + 1));
			re[i] = read.nextInt();
		}
		
		System.out.println("\nFaces\t\tVezes\n");
		
		for (int j = 0, qnt = 0, face = 1; face <= 6; j++) {
			if (re[j] == face) {
				qnt++;
			}
			if (j == (re.length - 1)) {
				System.out.printf("(%d)\t-\t%d\n",face,qnt);
				qnt = 0;
				j = -1;
				++face;
			}
			
		}
	}

}
