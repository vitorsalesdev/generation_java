package application;

/*2- Desenvolver um sistema que efetue a soma de todos os números
 *  ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 * */

public class Ex_2_for {
	public static void main(String[] args) {
	int number, sum = 0;
	
	for(number = 0; number <= 500; number ++) {
		if(number % 3 == 0 && number % 2 != 0) {
			sum = sum + number;
		}
	}
	System.out.printf("The sum of all odd numbers that are multiples of three and that are in the set of numbers from 1 to 500 is: %d", sum);
	}
}