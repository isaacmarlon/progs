package listaMatrizes;
import java.util.Scanner;

public class Q04 {
   
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
       float matriz[][] = { {1.5f,2.6f}, {2.0f,10.5f}};
       
       System.out.print("Número: ");
       float numero = leia.nextFloat();
       
       boolean bucho = false;
       int linha = 0, coluna = 0;
       
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j])  {
                    bucho = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }      
       }
       
       if(bucho) System.out.printf("Foi encontrado o valor %.2f em matriz[%d][%d].\n",numero,linha,coluna);
       else System.out.println("Elemento não encontrado.");
       
      
      
       
    }
    
    
}
