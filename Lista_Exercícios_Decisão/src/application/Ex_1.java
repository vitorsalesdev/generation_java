package application;

import java.util.Locale;
import java.util.Scanner;

/*1-	Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Ex_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in); 
		final int N_VALUE = 3;
		int value[] = new int[N_VALUE];
		int highestValue = 0, i;
		
		for(i = 0; i < N_VALUE; i++) {
			System.out.printf("Enter the %d° integer number: ", (i + 1));
			value[i] = kb.nextInt();
			if(value[i] > highestValue) {
				highestValue = value[i];
			}
		}
		System.out.printf("\nThe highest value is %d", highestValue);
		kb.close();
	}
}
