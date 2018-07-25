public class Lala {

	public static void main(String[] args) {

		char[][] matriz = { { 'A', 'B', 'C', 'D' }, { 'L', 'U', 'L', 'A' }, { 'B', 'R', 'A', 'S' } };

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				converteDiagonalString(matriz, i, j);

				/*
				 * if (diagonalMatriz.contains(palavra)) {
				 * 
				 * situacao.delete(0, situacao.length());
				 * 
				 * int lComeco = diagonalMatriz.indexOf(palavra.toUpperCase());
				 * 
				 * situacao.append(insereSituacao(lComeco, i, lComeco + palavra.length()-1, i));
				 * 
				 * break;
				 */
			}

		}

	}

	private static void converteDiagonalString(char[][] m, int linha, int coluna) {

		StringBuilder diagonal = new StringBuilder();

		int indexColunas = m[linha].length - coluna;
		int indexLinhas = m.length - linha;

		int tamanhoDiagonal = (indexColunas <= indexLinhas) ? indexColunas : indexLinhas;

		for (int i = 0; i < tamanhoDiagonal; i++) {

			diagonal.append(m[linha][coluna]);

			++linha;
			++coluna;

		}

		System.out.println(diagonal);

	}

}
