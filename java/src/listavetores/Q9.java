package listavetores;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int horas[] = new int[90];
		int q100 = 0, q10 = 0;
		for (int i = 0; i < horas.length; i++) {
			System.out.printf("%dª qHoras: ",(i + 1));
			horas[i] = read.nextInt();
			
			if ((horas[i] > 100) && (horas[i] <= 310)) {
				q100++;
			} 
			else if ((horas[i] >= 0) && (horas[i] < 10)) {
				q10++;
			} 
			else if ((horas[i] < 0) || (horas[i] > 310)) {
				System.out.printf("\nErro: qHoras inválida.\nTente novamente...\n\n");
				--i;
			}
		}
		
		System.out.printf("\nÍndice\t\tHoras\n\n");
		
		for (int j = 0; j < horas.length; j++) {
			System.out.printf("[%d]\t=\t%d\n",j,horas[j]);
		}
		
		System.out.printf("\nPor mais de 100H: %d alunos\n",q100);
		System.out.printf("\nPor menos de 10H: %d alunos\n",q10);
	}
}
