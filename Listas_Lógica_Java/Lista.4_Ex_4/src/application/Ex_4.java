package application;

import java.util.Random;

/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/



public class Ex_4 {

	public static void main(String[] args) {
		final int LINE = 3, COLUMN = 3, LIMIT = 10;
		int lCount, cCount, sum = 0, diagonalSum = 0;
		int matrix[][] = new int[LINE][COLUMN];
		Random rd = new Random();
		
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				matrix[lCount][cCount] = rd.nextInt(LIMIT);
			}
		}
		System.out.println("The matrix is : \n");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				sum = sum + matrix[lCount][cCount];
				if(lCount == cCount) {
					diagonalSum = diagonalSum + matrix[lCount][cCount];
				}
				System.out.printf("[%d]", matrix[lCount][cCount]);
			}
			System.out.println();
		}
		System.out.printf("\nThe sum of all elements of the matrix is %d", sum);
		System.out.printf("\nThe sum of the main diagonal is %d", diagonalSum);
	}
}