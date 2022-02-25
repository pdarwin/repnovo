package ficha4;

public class FrutaPeso extends Fruta implements iDescontavel {

	/**
	 * Peso da fruta
	 */
	private double peso;
	
	/**
	 * Percentagem do desconto
	 */
	double percentagemDesconto;

	/**
	 * 
	 * @param nome
	 * @param precoBase
	 * @param peso
	 */
	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso = peso;
		this.percentagemDesconto= 0;
	}

	/**
	 * 
	 */
	@Override
	double pagar() {
		return peso * precoBase - descontar();
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public double descontar() {
		return peso * precoBase * percentagemDesconto / 100 ;
	}

	
	/**
	 * @return the percentagem
	 */
	public double getPercentagemDesconto() {
		return percentagemDesconto;
	}

	/**
	 * @param percentagem the percentagem to set
	 */
	public void setPercentagemDesconto(double percentagem) {
		this.percentagemDesconto = percentagem;
	}
	
}
