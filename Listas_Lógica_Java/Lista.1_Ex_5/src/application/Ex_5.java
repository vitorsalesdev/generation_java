package application;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */
public class Ex_5 {

	public static void main(String[] args) {
		float grade1, grade2, grade3, average;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the first grade: ");
		grade1 = keyboard.nextFloat();
		System.out.printf("Enter the second grade: ");
		grade2 = keyboard.nextFloat();
		System.out.printf("Enter the third grade: ");
		grade3 = keyboard.nextFloat();
		
		average = (((grade1 * 2) + (grade2 * 3) + (grade3 * 5)) / 10);
		
		System.out.printf("\nThe average grade is %.2f", average);
	}
}
