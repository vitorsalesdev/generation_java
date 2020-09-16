package aplicacao;

import java.nio.channels.NoConnectionPendingException;
import java.util.Scanner;
import entidades.Cliente;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
*/

public class Principal {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		Cliente novoCliente = new Cliente();
		
		System.out.printf("Digite o nome do cliente: ");
		novoCliente.nomeCliente = kb.nextLine();
		System.out.printf("Digite a idade do cliente: ");
		novoCliente.idadeCliente = kb.nextInt();
		System.out.printf("Digite o gênero do cliente. (M) para masculino ou (F) para feminino: ");
		novoCliente.generoCliente = kb.next().toUpperCase().charAt(0);
		System.out.printf("Digite o e-mail do cliente: ");
		novoCliente.emailCliente = kb.next();
		System.out.printf("Digite o telefone do cliente: ");
		novoCliente.telefoneCliente = kb.nextLong();
		System.out.printf("Digite o endereço do cliente: ");
		novoCliente.enderecoCliente = kb.nextLine();
		
		System.out.printf("\n\nOs dados do cliente são :\n");
		novoCliente.mostrarNome();
		novoCliente.mostrarIdade();
		novoCliente.mostrarGenero();
		novoCliente.mostrarEmail();
		novoCliente.mostrarTelefone();
		novoCliente.mostrarEndereco();
	}
}