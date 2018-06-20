import java.util.Scanner;
public class Q02 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Linhas: ");
		int l = read.nextInt();
		System.out.print("Colunas: ");
		int r = read.nextInt();
		
		double[][] m1 = new double[l][r];
		double[][] m2 = new double[l][r];
		
		readMatrix(m1);
		readMatrix(m2);
		
		double produto = multiDiagonal(m1,m2);
		
		System.out.println("Produto = " + produto);
	}
	
	static Scanner readForgot = new Scanner(System.in);
	
	static void readMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("m[%d][%d]: ",i,j);
				matrix[i][j] = readForgot.nextDouble();
			}
		}
	}
	
	static double multiDiagonal(double[][] m1, double[][] m2) {
		double result = 0;
		for (int i = 0; i < m2.length; i++) {
			result += m1[i][i] * m2[i][i];
		}
		return result;
	}
}
