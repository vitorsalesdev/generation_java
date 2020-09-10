package application;
/*
Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
*/

public class Ex_1 {

	public static void main(String[] args) {
		
		int number;
		
		for(number = 1000; number < 2000; number++) {
			if(number % 11 == 5) {
				System.out.println(number);
			}
		}
	}
}
