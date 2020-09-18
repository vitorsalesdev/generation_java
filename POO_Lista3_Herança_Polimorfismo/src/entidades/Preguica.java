package entidades;

public class Preguica extends Animal{
	
	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Preguica(String nome, String idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public Preguica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void emitirSom() {
		System.out.println("Preguiça está fazendo um som estranho");
	}
	@Override
	public void acao() {
		System.out.println("A preguiça está subindo a árvore");
	}
}