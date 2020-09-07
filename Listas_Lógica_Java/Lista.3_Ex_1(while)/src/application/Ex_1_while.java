package application;

import java.util.Scanner;
/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final 
o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve 
parar quando o usuário fornecer um valor negativo.
*/
public class Ex_1_while {

	public static void main(String[] args) {
		double number, sum = 0, average;
		int readings = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("Enter the number: ");
		number = kb.nextDouble();
		while(number >= 0) {
			sum = sum + number;
			System.out.printf("Enter the number: ");
			number = kb.nextDouble();
			readings++;
		}
		average = sum / readings;
		System.out.printf("\nThe sum of the numbers is %.2f", sum);
		System.out.printf("\nThe average of the numbers is %.2f", average);
		System.out.printf("\nThe total numbers read was %d", readings);
	}
}
