package application;

import java.util.Random;
import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

*/

public class Ex_4 {

	public static void main(String[] args) {
		
		final int LINE = 2, COLUMN = 2, RANDOM = 10;
		int matrix1[][] = new int[LINE] [COLUMN];
		int matrix2[][] = new int[LINE] [COLUMN];
		int matrix3[][] = new int[LINE] [COLUMN];
		int lCount, cCount, option;
		Random rd = new Random();
		Scanner kb = new Scanner(System.in);
		
		
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				System.out.printf("Enter the value of position [%d - %d] of the first matrix: ", lCount, cCount);
				matrix1[lCount][cCount] = kb.nextInt();
			}
		}
		for(lCount = 0; lCount < LINE; lCount++) {
			for(cCount = 0; cCount < COLUMN; cCount++) {
				System.out.printf("Enter the value of position [%d - %d] of the second matrix:", lCount, cCount);
				matrix2[lCount][cCount] = kb.nextInt();
			}
		}
		System.out.println("\nChoose one of the following options: ");
		System.out.println("(1) - Sum the two matrices");
		System.out.println("(2) - Subtract the first matrix from the second");
		System.out.println("(3) - Add a constant to the two arrays");
		System.out.println("(4) - Print the matrices");
		System.out.println("Enter your option: ");
		option = kb.nextInt();
		if(option == 1) {
			System.out.println("\nThe matrix resulting from the sum of the first and second matrix is :");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					matrix3[lCount][cCount] = matrix1[lCount][cCount] + matrix2[lCount][cCount];
					System.out.printf("[%d]", matrix3[lCount][cCount]);
				}
				System.out.println();
			}
		}
		else if(option == 2) {
			System.out.println("\nThe result of subtracting the first matrix from the second is:");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					matrix3[lCount][cCount] = matrix2[lCount][cCount] - matrix1[lCount][cCount];
					System.out.printf("[%d]", matrix3[lCount][cCount]);
				}
				System.out.println();
			}
		}
		else if(option == 3) {
			System.out.printf("Enter the value of constant: ");
			final int CONST = kb.nextInt();
			System.out.println("\n\nThe result of the first matrix added to the constant :");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					System.out.printf("[%d]", matrix1[lCount][cCount] + CONST);
				}
				System.out.println();
			}
			System.out.println("\nThe result of the second matrix added to the constant :");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					System.out.printf("[%d]", matrix2[lCount][cCount] + CONST);
				}
				System.out.println();
			}
		}
		else if(option == 4) {
			System.out.println("\nThe first matrix is :");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					System.out.printf("[%d]", matrix1[lCount][cCount]);
				}
				System.out.println();
			}
			System.out.println("\nThe second matrix is :");
			for(lCount = 0; lCount < LINE; lCount++) {
				for(cCount = 0; cCount < COLUMN; cCount++) {
					System.out.printf("[%d]", matrix2[lCount][cCount]);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("\nYou entered an invalid option");
		}
	}
}