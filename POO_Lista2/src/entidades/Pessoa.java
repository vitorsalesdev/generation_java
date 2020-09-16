/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) 
 * e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores 
 * conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
 */

package entidades;

public class Pessoa {
	private String nome;
	private String Endere�o;
	private String Telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		Endere�o = endere�o;
	}

	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		Endere�o = endere�o;
		Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return Endere�o;
	}

	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
}
