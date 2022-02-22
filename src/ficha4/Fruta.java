package ficha4;

public abstract class Fruta {

	/*
	 * nome da fruta
	 */
	protected String nome;
	
	/*
	 * preço base da fruta
	 */
	protected double precoBase;
	
	/**
	 * @param nome
	 * @param precoBase
	 */
	public Fruta(String nome, double precoBase) {
		super();
		this.nome = nome;
		this.precoBase = precoBase;
	}

	/**
	 * 
	 * @return
	 */
	abstract double pagar();
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the precoBase
	 */
	public double getPrecoBase() {
		return precoBase;
	}
	
}
