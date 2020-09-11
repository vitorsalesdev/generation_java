package application;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/

public class Ex_2 {

	public static void main(String[] args) {
		
		final int POSITIONS = 6;
		int array[] = new int[POSITIONS];
		int i, sumEven = 0, oddCount = 0;
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("Enter the number: ");
			array[i] = kb.nextInt();
			if(array[i] % 2 == 0 || array[i] % -2 == 0) {
				sumEven = sumEven + array[i];
			}
			else {
				oddCount++;
			}
		}
		System.out.printf("\nThe even numbers entered is: ");
		for(i = 0; i < POSITIONS; i++) {
			if(array[i] % 2 == 0 || array[i] % -2 == 0) {
				System.out.printf("%d ", array[i]);
			}
		}
		System.out.printf("\nThe sum of all odd numbers is: %d", sumEven);
		System.out.printf("\nThe odd numbers entered is: ");
		for(i = 0; i < POSITIONS; i++) {
			if(array[i] % 2 != 0 || array[i] % -2 != 0) {
				System.out.printf("%d ", array[i]);
			}
		}
		System.out.printf("\nIn total %d odd numbers were entered", oddCount);
	}
}