package application;

import java.util.Random;

/*5.     Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.
 * 
 */

public class Ex_5 {
	
	public static void main(String[] args) {
		
		final int LINE = 6, COLUMN = 6, RANDOM = 16, LIMIT = 10;
		int lCount, cCount, limitCount = 0;
		int matrix[][]= new int[LINE][COLUMN];
		Random rd = new Random();

		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = rd.nextInt(RANDOM);
				System.out.printf("[%d]", matrix[lCount][cCount]);
			if(matrix[lCount][cCount] > LIMIT) {
				limitCount++;
			}
			}
			System.out.println();
		}
		System.out.printf("\nIn total %d values are greater than %d", limitCount, LIMIT);
	}
}