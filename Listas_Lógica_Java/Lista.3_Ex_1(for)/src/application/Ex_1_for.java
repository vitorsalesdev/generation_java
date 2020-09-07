package application;

import java.util.Scanner;

/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00. 
*/

public class Ex_1_for {

	public static void main(String[] args) {
		final double LIMIT_SALARY = 100;
		final int POPULATION = 3;
		int nChildren, totalChildren = 0, salaryCont = 0, i;
		double salary, averageChildren, averageSalary, highestSalary = 0, totalSalary = 0, percent;
		Scanner keyboard = new Scanner(System.in);
		
		for(i = 1; i <= POPULATION; i++) {
			System.out.printf("Enter the interviewee's salary: ");
			salary = keyboard.nextDouble();
			System.out.printf("Enter the number of children of the interviewee: ");
			nChildren = keyboard.nextInt();
			totalSalary = totalSalary + salary;
			totalChildren = totalChildren + nChildren;
			if(salary > highestSalary) {
				highestSalary = salary;
			}
			if(salary <= LIMIT_SALARY) {
				salaryCont++;
			}
		}
		averageSalary = totalSalary / POPULATION;
		averageChildren = totalChildren / POPULATION;
		percent = (salaryCont / POPULATION) * 100;
		System.out.printf("\nThe average salary of the population is R$ %.2f", averageSalary);
		System.out.printf("\nThe average number of children is %.0f", averageChildren);
		System.out.printf("\nThe highestSlary is %.2f", highestSalary);
		System.out.printf("\nThe percentage of people with a salary of up to R$ %.2f is %.2f%%", LIMIT_SALARY, percent);
	}
}