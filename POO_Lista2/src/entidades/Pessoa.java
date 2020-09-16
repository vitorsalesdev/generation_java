/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) 
 * e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores 
 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 */

package entidades;

public class Pessoa {
	private String nome;
	private String Endereço;
	private String Telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		Endereço = endereço;
	}

	public Pessoa(String nome, String endereço, String telefone) {
		super();
		this.nome = nome;
		Endereço = endereço;
		Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
}
