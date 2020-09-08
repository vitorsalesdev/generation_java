package application;

import java.util.Random;

/*6.     Faça um programa que carregue uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a matriz digitada multiplica pelo 
 *  maior elemento da matriz;
*/

public class Ex_6 {

	public static void main(String[] args) {
		final int LINE = 2, COLUMN = 2, RANDOM = 10;
		int matrix[][] = new int[LINE] [COLUMN];
		int lCount, cCount, multiplier = 0;
		Random rd = new Random();
		
		System.out.println("The matrix is :");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = rd.nextInt(RANDOM);
				if(matrix[lCount][cCount] > multiplier) {
					multiplier = matrix[lCount][cCount];
				}
				System.out.printf("[%d]", matrix[lCount][cCount]);
			}
			System.out.println();
		}
		System.out.println("The matrix resulting from multiplication by the highest element is:");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = matrix[lCount][cCount] * multiplier;
				System.out.printf("[%d]", matrix[lCount][cCount]);
			}
			System.out.println();
		}
	}
}