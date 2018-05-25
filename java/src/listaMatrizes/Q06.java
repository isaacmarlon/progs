package matriz;
import java.util.Scanner;

public class Q06 {
 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int m1[][] = new int[5][5];
        int m2[][] = new int[5][5];
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf("m1[%d][%d]: ",i,j);
                m1[i][j] = leia.nextInt();
            }
        }
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.printf("m1[%d][%d]: ",i,j);
                m2[i][j] = leia.nextInt();
            }
        }
    }
    
}
