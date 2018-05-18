package listavetores;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String a1[] = new String[4];
		String a2[] = new String[4];
		String idx[] = new String[8];
		
		for (int i = 0, pass = 1; pass != 3; i++) {
			if (pass == 1) {
				System.out.printf("%dº (a1): ", (i + 1));
				a1[i] = read.nextLine();
			} else {
				System.out.printf("%dº (a2): ", (i + 1));
				a2[i] = read.nextLine();
			}
			if (i == (a1.length - 1)) {
				++pass;
				i = -1;
				System.out.println();
			}
		}

		int qntIguais = 0;
		boolean rep = false;
		
		for (int i = 0, cIdx = 0; i < a1.length; i++) {
			for (int q = (i + 1); q < a1.length; q++) {
				if (a1[i].equals(a1[q])) 	++i;
			}
			
			for (int j = 0; j < a1.length; j++) {
				if ((a1[i].equals(a2[j]))) {
					for (int k = 0; k < a1.length; k++) {
						if (a1[i].equals(idx[k])) {
							rep = true;
						}
					}
					
					if(!rep) {
						idx[cIdx] = a1[i];
						++cIdx;
						++qntIguais;
					} else {
						rep = false;
					}
				}
			}
		}
		
		
		String a3[] = new String[qntIguais];
		
		for (int i = 0; i < qntIguais; i++) {
			a3[i] = idx[i];
		}
		
		for (int i = 0; i < a3.length; i++) {
			System.out.printf("[%s]\n",a3[i]);
		}
		
	}

}
