package ficha4;

public class FrutaVolume extends Fruta implements iDescontavel{

	/**
	 * Percentagem do desconto
	 */
	double percentagemDesconto;
	
	/**
	 * Volume da fruta comprada 
	 */
	private double volume;
	
	/**
	 * 
	 * @param nome
	 * @param precoBase
	 * @param volume
	 */
	public FrutaVolume(String nome, double precoBase, double volume) {
		super(nome, precoBase);
		this.volume = volume;
		this.percentagemDesconto= 0;
	}

	/**
	 * 
	 */
	@Override
	double pagar() {
		return volume * precoBase - descontar();
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public double descontar() {
		return volume * precoBase * percentagemDesconto / 100;
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
