package application;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/

import java.util.Random;

public class Ex_3 {
	
	public static void main(String[] args) {
		
		final int LINE = 3, COLUMN = 3, RANDOM = 16, LIMIT = 10;
		int lCount, cCount, limitCount = 0;
		int matrix[][]= new int[LINE][COLUMN];
		Random rd = new Random();

		System.out.println("The matrix is: ");
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