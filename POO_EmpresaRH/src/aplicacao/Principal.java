package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Funcionario;
import entidades.Terceiro;

public class Principal {

	public static void main(String[] args) {
		int n, i, hora;
		double valor, valorExtra, horaExtra;
		char ch;
		String nome;
		
		Scanner kb =  new Scanner(System.in);
		List<Funcionario> list = new ArrayList();
		
		System.out.printf("Digite o número de funcionários: ");
		n = kb.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.printf("Cadastro funcionário %d: ", i + 1);
			System.out.printf("\nTerceiro [S/N]: ");
			ch = kb.next().toUpperCase().charAt(0);
			System.out.printf("Nome: ");
			nome = kb.next().toUpperCase();
			System.out.printf("Horas trabalhadas: ");
			hora = kb.nextInt();
			System.out.printf("Valor da hora trabalhada: ");
			valor = kb.nextDouble();
			if(ch == 'S') {
				System.out.printf("Horas extras trabalhadas: ");
				horaExtra = kb.nextDouble();
				list.add(new Terceiro(nome, hora, valor, horaExtra));
			}
			else {
				list.add(new Funcionario(nome, hora, valor));
			}	
		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for(Funcionario func : list) {
			System.out.println(func.getNome() + " " + func.pagamento());
		}
	}
}
