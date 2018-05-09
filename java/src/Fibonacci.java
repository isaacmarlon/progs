import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fib=0, ant=1;
		
		for(int i=1; i<=10; i++) {
			System.out.print(fib + " ");
			fib += ant;
			ant = fib - ant;
		}
	}
}
