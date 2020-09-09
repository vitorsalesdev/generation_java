package application;

import java.util.Locale;
import java.util.Scanner;
/*2-	Faça um programa que entre com três números e coloque em ordem crescente.*/

public class Ex_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in); 
		final int N_VALUE = 5;
		int value[] = new int[N_VALUE];
		int switchh;
		int i, j;
		
		for(i = 0; i < N_VALUE; i++) {
			System.out.printf("Enter the %d° number: ", (i + 1));
			value[i] = kb.nextInt();
		}
		for(i = 0; i < N_VALUE; i++) {
			for(j = (i + 1); j < N_VALUE; j++) {
				if(value[i] > value[j]) {
					switchh = value[i];
					value[i] = value[j];
					value[j] = switchh;
				}
			}
		}
		System.out.println("The numbers in ascending order are:");
		for(i = 0; i < N_VALUE; i++) {
			System.out.println(value[i]);
		}
		kb.close();
	}
}