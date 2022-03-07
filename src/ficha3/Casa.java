package ficha3;

public class Casa {

	private String morada; //morada da casa
	private double precoCusto; //preço de custo da casa
	private double precoVenda; //preço de venda da casa
	
	/**
	 * Construtor
	 */
	public Casa() {
	}
	
	/**
	 * Outro construtor
	 * @param morada - morada da casa
	 */
	public Casa(String morada) {
		this.morada = morada;
	}

	/**
	 * 
	 * @return o lucro da venda da casa
	 */
	public double getLucro ()
	{
		return precoVenda - precoCusto;
	}
	
	/**
	 * 
	 * @return 
	 */
	 public double getPercentMargemLucro()
	 {
		 return precoVenda / precoCusto;	 
	 }
	 
	 public String toString ()
	 {
		 return "Morada: " + morada + " | Preço de custo: " + precoCusto + " | Preço de venda: " + precoVenda + " | Lucro: " + getLucro() + " | % margem de lucro: " + getPercentMargemLucro();
	 }
	
	/**
	 * @return the morada
	 */
	public String getMorada() {
		return morada;
	}

	/**
	 * @param morada the morada to set
	 */
	public void setMorada(String morada) {
		this.morada = morada;
	}

	/**
	 * @return the precoCusto
	 */
	public double getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * @param precoCusto the precoCusto to set
	 */
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * @return the precoVenda
	 */
	public double getPrecoVenda() {
		return precoVenda;
	}

	/**
	 * @param precoVenda the precoVenda to set
	 */
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
	
	
	
}
