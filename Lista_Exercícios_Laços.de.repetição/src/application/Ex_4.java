package application;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 
 * 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

public class Ex_4 {

	public static void main(String[] args) {

		final int INTERVIEWED = 5;
		int age, gender, personality, calmPerson = 0, nervousWoman = 0, aggressiveMan = 0, nervousOver40 = 0, calmUnder18 = 0, i = 0;
		Scanner kb = new Scanner(System.in);
		
		while(i < INTERVIEWED) {
			System.out.printf("Enter your age: ");
			age = kb.nextInt();
			System.out.printf("Enter your gender. Female(1) | Male(2): ");
			gender = kb.nextInt();
			System.out.printf("Enter your personality. Calm(1) | Nervous(2) | Aggressive (3): ");
			personality = kb.nextInt();
			
			if(personality == 1) {
				calmPerson++;
			}
			if(gender == 1 && personality == 2) {
				nervousWoman++;
			}
			if(gender == 2 && personality == 3) {
				aggressiveMan++;
			}
			if(age > 40 && personality == 2) {
				nervousOver40++;
			}
			if(age < 18 && personality == 1) {
				calmUnder18++;
			}
			i++;
		}
		System.out.printf("\nTotal calm people: %d", calmPerson);
		System.out.printf("\ntotal nervous women: %d", nervousWoman);
		System.out.printf("\nTotal aggressive men: %d", aggressiveMan);
		System.out.printf("\nTotal nervous people over 40 years old: %d", nervousOver40);
		System.out.printf("\nTotal calm peolple under 18 years old: %d", calmUnder18);
	}
}