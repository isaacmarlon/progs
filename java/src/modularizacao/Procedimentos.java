package modularizacao;
import java.util.Scanner;

public class Procedimentos {
    
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        hello();
        System.out.print("");
        int qnt = read.nextInt();
        int[] num = new int[qnt];
        System.out.println(somaAritmetica(10,30));
        
    }
    
    static void hello() {
        System.out.println("Hello functions!");
    }
    
    
    
    
    
    static int somaAritmetica(int a, int b) { return a + b; }
    static void readMatrix1(int[] num) {
        for (int i = 0; i < 10; i++) { num[i] = read.nextInt(); }
    }
    
}
