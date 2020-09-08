package application;

import java.util.Random;

/*4.     Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.
*/

public class Ex_4 {

	public static void main(String[] args) {
		final int LINE = 10, COLUMN = 10, LIMIT = 10;
		int lCount, cCount, highestValue;
		int matrix[][]= new int[LINE][COLUMN];
		Random rd = new Random();

		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = rd.nextInt(LIMIT);
				System.out.printf("[%d]", matrix[lCount][cCount]);
			}
			System.out.println();
		}
		highestValue = matrix[0][0];
		for(lCount = 0; lCount < LINE;lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				if(matrix[lCount][cCount] > highestValue) {
					highestValue = matrix[lCount][cCount];
				}
			}
		}
		for(lCount = 0; lCount < LINE;lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				if(matrix[lCount][cCount] == highestValue) {
					System.out.printf("\nThe highest value(%d) was found at the position [%d - %d] of the matrix ", highestValue, lCount, cCount);
				}
			}
		}
	}
}