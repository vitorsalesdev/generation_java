package aplicacao;

import java.util.Scanner;

import entidades.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ContaBancaria novoCliente = new ContaBancaria();
		
		System.out.printf("Digite o nome do cliente: ");
		novoCliente.nomeCliente = kb.nextLine();
		System.out.printf("Digite a idade do cliente: ");
		novoCliente.idadeCliente = kb.nextInt();
		System.out.printf("Digite o CPF do cliente: ");
		novoCliente.cpfCliente = kb.nextLong();
		System.out.printf("Digite o gênero do cliente. (M) para masculino ou (F) para feminino: ");
		novoCliente.generoCliente = kb.next().toUpperCase().charAt(0);
		System.out.printf("Digite o e-mail do cliente: ");
		novoCliente.emailCliente = kb.next();
		System.out.printf("Digite o telefone do cliente: ");
		novoCliente.telefoneCliente = kb.nextLong();
		System.out.printf("Digite o endereço do cliente: ");
		novoCliente.enderecoCliente = kb.nextLine();
		System.out.printf("Digite o saldo do cliente: ");
		novoCliente.saldoCliente = kb.nextDouble();
	
		novoCliente.mostrarDados();
	}
}
