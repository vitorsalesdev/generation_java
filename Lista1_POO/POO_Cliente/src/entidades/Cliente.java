package entidades;

public class Cliente {
	
	public String nomeCliente;
	public String enderecoCliente;
	public int idadeCliente;
	public String emailCliente;
	public long telefoneCliente;
	public char generoCliente;
	
	public void mostrarNome() {
		System.out.printf("\nNome: %s", nomeCliente);
	}
	public void mostrarEndereco() {
		System.out.printf("\nEndere�o: %s", enderecoCliente);
	}
	public void mostrarIdade() {
		System.out.printf("\nIdade: %d", idadeCliente);
	}
	public void mostrarTelefone() {
		System.out.printf("\nTelefone: %d", telefoneCliente);
	}
	public void mostrarGenero() {
		if(generoCliente == 'M') {
			System.out.printf("\nG�nero: Masculino");
		}
		else if(generoCliente == 'F') {
			System.out.printf("\nG�nero: Feminino");
		}
	}
	public void mostrarEmail() {
		System.out.printf("\nE-mail: %s", emailCliente);
	}
}