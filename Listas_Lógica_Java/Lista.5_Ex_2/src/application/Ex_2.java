package application;

import java.util.Random;

/*2.     Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.
*/

public class Ex_2 {

	public static void main(String[] args) {
		final int POSITIONS = 40, LIMIT = 10;
		int value[] = new int[POSITIONS];
		int i, even = 0;
		Random rb = new Random();
		
		System.out.println("The vector is: ");
		for(i = 0; i < POSITIONS; i++) {
			value[i] = rb.nextInt(LIMIT);
			if(value[i] % 2 == 0 || value[i] %-2 == 0) {
				even++;
			}
			System.out.printf("[%d]", value[i]);
		}
		if(even > 0) {
			System.out.printf("\n\nIn the %d position(s) of the vector there are %d even numbers", POSITIONS, even);
		}
		else {
			System.out.printf("\n\nIn the %d position(s) of the vector there are no even numbers", POSITIONS);
		}
	}
}
