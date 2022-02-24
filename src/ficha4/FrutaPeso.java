package ficha4;

public class FrutaPeso extends Fruta implements iDescontavel {

	/**
	 * 
	 */
	private double peso;
	
	/**
	 * 
	 */
	double percentagem;

	/**
	 * 
	 * @param nome
	 * @param precoBase
	 * @param peso
	 */
	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso = peso;
		this.percentagem= 0;
	}

	/**
	 * 
	 */
	@Override
	double pagar() 
	{
		return peso * precoBase;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public double descontar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * @return the percentagem
	 */
	public double getPercentagem() {
		return percentagem;
	}

	/**
	 * @param percentagem the percentagem to set
	 */
	public void setPercentagem(double percentagem) {
		this.percentagem = percentagem;
	}
	
}
