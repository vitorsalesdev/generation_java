package application;

import java.util.Scanner;

/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

public class Ex_1 {

	public static void main(String[] args) {

		final int POSITIONS= 6;
		int A[] = new int[POSITIONS];
		int i, sum; 
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("Enter the number: ");
			A[i] = kb.nextInt();
			}
		System.out.println("\nThe array is: ");
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("[%d]", A[i]);
			}
		sum = A[0] + A[1] + A[5];
		System.out.printf("\n\nThe sum of positions A[0], A[1] and A[5] of the array is: %d", sum);
		A[4] = 100;
		System.out.println("\nThe final array is: ");
		for(i = 0; i < POSITIONS; i++) {
			System.out.printf("[%d]\n", A[i]);
			}
	}
}
