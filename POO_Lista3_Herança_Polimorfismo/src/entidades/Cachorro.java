package entidades;

public class Cachorro extends Animal{
	
	public Cachorro() {
		super();
	}
	public Cachorro(String nome, String idade) {
		super(nome, idade);
	}
	public Cachorro(String nome) {
		super(nome);
	}
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}
	@Override
	public void acao() {
		System.out.println("O cachorro está correndo");
	}
}