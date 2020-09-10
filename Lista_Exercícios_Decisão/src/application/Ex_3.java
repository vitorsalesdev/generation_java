package application;

import java.util.Scanner;
/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·                     10-14 infantil
·                     15-17 juvenil
·                     18-25 adulto*/

public class Ex_3 {

	public static void main(String[] args) {
		int swimmerAge;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter swimmer's age: ");
		swimmerAge = keyboard.nextInt();
		
		if(swimmerAge >= 10 && swimmerAge <= 14) {
			System.out.println("The swimmer belongs to the children's category");
		}
		else if(swimmerAge >= 15 && swimmerAge <= 17) {
			System.out.println("The swimmer belongs to the youth category");
		}
		else if(swimmerAge >= 18 && swimmerAge <= 25) {
			System.out.println("The swimmer belongs to the adult category");
		}
		else {
			System.out.println("There is no category for this age");
		}
	}
}