public class Tal {

	public static void main(String[] args) {
		int m[][] = new int[5][5];
		
		for (int i = -1, j = -1; m[4][0] != 1;) {
			if (i == 2) { ++m[j][i]; }
			if (i < (m.length - 1) && (m[4][4] != 1)) {
				++i;
				++j;
			}
			else if ((j == i) && (i > 0)) j = 0;
			else if (i >= 0) {
				++j;
				--i;
			}
			if ((i >= 0) && (i != 2)) { m[j][i] = 1; } 
			
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%d]",m[i][j]);
			}
			System.out.println();
		}
	}
}
