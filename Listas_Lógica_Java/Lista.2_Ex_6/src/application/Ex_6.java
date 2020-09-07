package application;

import java.util.Scanner;

/* 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
*/

public class Ex_6 {

	public static void main(String[] args) {
		int swimmerAge;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter swimmer's age: ");
		swimmerAge = keyboard.nextInt();
		
		if(swimmerAge >= 5 && swimmerAge <= 7) {
			System.out.println("The swimmer belongs to the children's category A");
		}
		else if(swimmerAge >= 8 && swimmerAge <= 11) {
			System.out.println("The swimmer belongs to the children's category B");
		}
		else if(swimmerAge == 12 || swimmerAge == 13) {
			System.out.println("The swimmer belongs to the youth category A");
		}
		else if(swimmerAge >= 13 && swimmerAge <= 17) {
			System.out.println("The swimmer belongs to the youth category B");
		}
		else if(swimmerAge >= 18) {
		System.out.println("The swimmer belongs to the adult category");
		}
		else {
			System.out.println("There is no category for this age");
		}
	}
}