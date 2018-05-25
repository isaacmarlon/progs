package matriz;
import java.util.Scanner;

public class Q03 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int matriz[][] = new int[2][2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]: ",i,j);
                matriz[i][j] = leia.nextInt();
            }
        }
        
        System.out.println();
        
         for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%s]",matriz[i][i]);
            System.out.println();
        }
        
        
    }
    
    
}
