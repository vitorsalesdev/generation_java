package application;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma 
 * fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */

public class Ex_3 {
	
	public static void main(String args[])
	{
		int duration, hour, minute, second;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the duration of the event in seconds: ");
		duration = keyboard.nextInt();
		
		hour = (duration / 3600);
		minute = (duration % 3600) / 60;
		second = (duration / 3600) % 60;
		
		System.out.printf("\nThe duration of the event was %d hour(s), %d minute(s) and %d second(s)", hour, minute, second);
	}
}