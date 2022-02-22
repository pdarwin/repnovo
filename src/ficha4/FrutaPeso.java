package ficha4;

public class FrutaPeso extends Fruta {

	private double peso;
	
	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso = peso;
	}

	@Override
	double pagar() 
	{
		return peso * precoBase;
	}
	
	
}
