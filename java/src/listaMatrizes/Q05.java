package listaMatrizes;
import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int LINHAS = 3;
		final int COLUNAS = 20;
		
		float aluno[][] = new float[LINHAS][COLUNAS];
		
		float mediaAluno[] = new float[COLUNAS];
		char conceito[] = new char[COLUNAS];
		
		float mediaAvaliacao[] = new float[LINHAS];
		
		// ENTRADA DOS DADOS
		
		for (int i = 0; i < COLUNAS; i++) {
			System.out.printf("Aluno (%d) = \n\n",(i + 1));
			for (int j = 0; j < aluno.length; j++) {
				if (j < (LINHAS - 1)) System.out.printf("Nota prova (%d): ",(j + 1));
				else			System.out.print("Nota trabalho: ");
				aluno[j][i] = leia.nextFloat();
				mediaAvaliacao[j] += aluno[j][i]; // COLETANDO MEDIA DE CADA AVALIAÇÃO
			}
			System.out.println();
		}
		
		
		// COLETANDO NOTAS PARA A MÉDIA DO ALUNO
		
		for (int i = 0; i < COLUNAS; i++) {
			for (int j = 0; j < LINHAS; j++) {
				if (j < (LINHAS - 1)) mediaAluno[i] += 4 * aluno[j][i];
				else			mediaAluno[i] += 2 * aluno[j][i]; 
			}
		}
		
		// TIRANDO MÉDIA DO ALUNO
		
		for (int i = 0; i < mediaAluno.length; i++) {
			mediaAluno[i] /= 10;
		}
		
		// MÉDIA DE CADA AVALIAÇÃO
		
		for (int i = 0; i < mediaAvaliacao.length; i++) {
			mediaAvaliacao[i] /= COLUNAS;
		}
		
		// DEFININDO CONCEITO P/CADA ALUNO
		
		float media = 0;
		for (int i = 0; i < conceito.length; i++) {
			media = mediaAluno[i];
			if (media < 3.0)	conceito[i] = 'D';
			else if ((media >= 3.0) && (media < 6.0))	conceito[i] = 'R';
			else if ((media >= 6.0) && (media < 7.5))   conceito[i] = 'C';
			else if ((media >= 7.5) && (media < 9.0))	conceito[i] = 'B';
			else	conceito[i] = 'A';
		}
		
		// SAÍDA DOS DADOS
		
		for (int i = 0; i < COLUNAS; i++) {
			System.out.printf("Aluno (%d) ...:\n\n",(i + 1));
			for (int j = 0; j < aluno.length; j++) {
				if (j < (LINHAS - 1)) System.out.printf("Nota prova (%d): %.2f\n",(j + 1),aluno[j][i]);
				else			System.out.printf("Nota trabalho: %.2f\n",aluno[j][i]);
			}
			System.out.printf("Média: %.2f\n",mediaAluno[i]);
			System.out.printf("Conceito: %s\n",conceito[i]);
			System.out.println();
		}
		
		for (int i = 0; i < mediaAvaliacao.length; i++) {
			if (i < (mediaAvaliacao.length - 1)) 
				System.out.printf("Média prova (%d): %.2f\n",(i + 1),mediaAvaliacao[i]);
			else
				System.out.printf("Média trabalho: %.2f\n",mediaAvaliacao[i]);
		}
		
	}
    
}
