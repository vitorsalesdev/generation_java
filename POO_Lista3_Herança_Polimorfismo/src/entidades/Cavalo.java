package entidades;

public class Cavalo extends Animal{

	public Cavalo() {
		super();
	}
	public Cavalo(String nome, String idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public Cavalo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void emitirSom() {
		System.out.println("O cavalo está relinchando");
	}
	@Override
	public void acao() {
		System.out.println("O cavalo está correndo");
	}
}