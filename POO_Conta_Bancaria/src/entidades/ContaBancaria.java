package entidades;

public class ContaBancaria {
	
	public String nomeCliente;
	public long cpfCliente;
	public String enderecoCliente;
	public int idadeCliente;
	public String emailCliente;
	public long telefoneCliente;
	public char generoCliente;
	public double saldoCliente;
	
	public void mostrarDados() {
		System.out.printf("\n\nDados do cliente: \n");
		System.out.printf("\nNome: %s", nomeCliente);
		System.out.printf("\nIdade: %d", idadeCliente);
		if(generoCliente == 'M') {
			System.out.printf("\nG�nero: Masculino");
		}
		else if(generoCliente == 'F') {
			System.out.printf("\nG�nero: Feminino");
		}
		System.out.printf("\nCPF: %d", cpfCliente);
		System.out.printf("\nEndere�o: %s", enderecoCliente);
		System.out.printf("\nE-mail: %s", emailCliente);
		System.out.printf("\nTelefone %d", telefoneCliente);
		System.out.printf("\nSaldo: %.2f", saldoCliente);
	}
}