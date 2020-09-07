package application;

import java.util.Scanner;
import java.util.Random;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class Ex_2 {
	public static void main(String[] args) {
		final int ROLL_NUMBER = 10;
		int roll[] = new int[ROLL_NUMBER];
		int i, scoreCount = 0, highestScore = 0, totalScore = 0;
		double averageScore;
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
		for(i = 0; i < ROLL_NUMBER; i++) {
			roll[i] = rd.nextInt(6) + 1;
			totalScore = totalScore + roll[i];
			System.out.printf("The value of %d° roll is: %d \n", (i + 1), roll[i]);
			
			if(roll[i] == highestScore) {
				scoreCount++;
			}
			if(roll[i] > highestScore) {
				highestScore = roll[i];
				scoreCount = 1;
			}
		}
		averageScore = totalScore / ROLL_NUMBER;
		System.out.printf("\nThe dice has rolled %d times", ROLL_NUMBER);
		System.out.printf("\nThe average score of rolls is %.0f", averageScore);
		System.out.printf("\nThe highest score is: %d", highestScore);
		System.out.printf("\nThe number of occurrences of the highest score was %d", scoreCount);
	}
}