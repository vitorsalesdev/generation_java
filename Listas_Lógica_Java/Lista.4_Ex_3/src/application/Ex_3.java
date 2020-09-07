package application;

import java.util.Random;

public class Ex_3 {

	public static void main(String[] args) {
		final int LINE = 4, COLUMN = 6, LIMIT = 10;
		int lCount, cCount;
		int n1[][] = new int[LINE][COLUMN];
		int n2[][] = new int[LINE][COLUMN];
		int m1[][] = new int[LINE][COLUMN];
		int m2[][] = new int[LINE][COLUMN];
		Random rd = new Random();
		
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				n1[lCount][cCount] = rd.nextInt(LIMIT);
			}
		}
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				n2[lCount][cCount] = rd.nextInt(LIMIT);
			}
		}
		System.out.printf("The matrix N1 is: \n");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				System.out.printf("[%d]", n1[lCount][cCount]);
			}
			System.out.println();
		}
		System.out.printf("\nThe matrix N2 is: \n");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				System.out.printf("[%d]", n2[lCount][cCount]);
			}
			System.out.println();
		}
		System.out.printf("\nThe matrix resulting from the sum of the elements of the same position of matrices N1 and N2 is: \n");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				m1[lCount][cCount] = n1[lCount][cCount] + n2[lCount][cCount];
				System.out.printf("[%d]", m1[lCount][cCount]);
			}
			System.out.println();
		}
		System.out.printf("\nThe matrix resulting from the difference of the elements of the same position of matrices N1 and N2 is \n");
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount =0; cCount < COLUMN; cCount++) {
				m2[lCount][cCount] = n1[lCount][cCount] - n2[lCount][cCount];
				System.out.printf("[%d]", m2[lCount][cCount]);
			}
			System.out.println();
		}
	}
}