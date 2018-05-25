package matriz;
import java.util.Scanner;

public class Q01 {
  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int linhas = 1, colunas = 0;
        
        while (linhas != colunas) { 
            System.out.print("Linhas: ");
            linhas = leia.nextInt();
            System.out.print("Colunas: ");
            colunas = leia.nextInt();
            System.out.println("");
        } 
        
        String matriz[][] = new String[linhas][colunas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]: ",i,j);
                matriz[i][j] = leia.next();
            }
        }
        
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%s ",matriz[i][j]);
            }
            System.out.println();
        } 
    }
    
}
