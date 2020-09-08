package application;

import java.util.Scanner;

/*Leia um vetor de 40 posições e atribua valor 0 para todos 
 * os elementos que possuírem valores negativos.
*/

public class Ex_3 {
	public static void main(String[] args) {
		final int POSITIONS = 40;
		int value[] = new int[POSITIONS];
		int i;
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("Enter the value: ");
			value[i] = kb.nextInt();
			if(value[i] < 0) {
				value[i] = 0;
			}
		}
		System.out.printf("\nThe values of the vector are: \n");
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("[%d]", value[i]);
		}
	}
}