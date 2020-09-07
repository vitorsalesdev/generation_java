package application;

import java.util.Scanner;

/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/

public class Ex_1 {
	public static void main(String[] args) {
		final int SCORE_NUMBER = 5;
		int highestScore = 0, i;
		int score[] = new int[SCORE_NUMBER];
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < SCORE_NUMBER; i++) {
			System.out.printf("Enter the score: ");
			score[i] = kb.nextInt();
			if(score[i] > highestScore) {
				highestScore = score[i];
			}
		}
		for(i = 0; i < SCORE_NUMBER; i++) {
			System.out.println(score[i]);
		}
		System.out.printf("\nThe highest score is: %d", highestScore);
	}
}