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
		System.out.println("Pregui�a est� fazendo um som estranho");
	}
	@Override
	public void acao() {
		System.out.println("A pregui�a est� subindo a �rvore");
	}
}