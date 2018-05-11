public class Vetores {

	public static void main(String[] args) {
		// Declaração:
		
		int[] num1;/*
		int[] num1 = new int[];
		*/
		int num2[];/*
		int num2[] = new int[];
		*/
		
		// Determinando length: padrão
		
		int num3[] = new int[3];/*
		Vetor num3 com 3 posições: 
			0 , 1 , 2.
		*/
		int num4[] = new int[5];/*
		Vetor num4 com 5 posições: 
			0 , 1 , 2, 3, 4.
		*/
		
		// ATRIBUIÇÃO:
		
		num3[0] = 8; // num3 na posição 0 tem valor 8
		num3[1] = num3[0]++; // num3 na posição 1 recebe 8 e num3 na posição 1 incrementa -> 9
		num3[2] = --num3[1]; // num3 na posição 2 recebe 7 assim como num3 na posição 1, pois foi decrementado
		
		for (int i=0; i<3; i++) {
			System.out.printf("num3[%d] = %d \n",i,num3[i]);
		}
		
		
		// Determinando length: Array initializer
		/*
		 * If you want to initialize an array, you don't need
		 * to attribute one per one...
		*/
		
		
		int num5[] = {1,2,8};/*
		Vetor num4 com 3 posições: 
		0 , 1 , 2.
		
		Sendo:
			num5[0] == 1
			num5[1] == 2
			num5[2] == 8
	*/
		
		System.out.println();
		
		for (int i=0; i<3; i++) {
			System.out.printf("num[%d] = %d\n",i,num5[i]);
		}
		
		int num6[] = {1,5,9};
		
		System.out.println("\n" + num6[2]);
		
		
		// Array table
		
		System.out.println("\nIndex\tValue");
		int isaac[] = {1,1,2,3,5};
		
		for (int i=0; i < isaac.length; i++) {
			System.out.printf("[%d]\t%d\n",i,isaac[i]);
		}
		
		
		// Somming array
		
		int bucky[] = {1,2,5,6,8};
		int sum=0;
		
		for (int i=0; i < bucky.length; i++) {
			sum+= bucky[i];
		}
		
		System.out.println("\nsum = " + sum);
		
		
	}

}
