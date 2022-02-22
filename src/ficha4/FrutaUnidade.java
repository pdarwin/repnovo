package ficha4;

public class FrutaUnidade extends Fruta {

	private int unidades;
	
	public FrutaUnidade(String nome, double precoBase, int unidades) {
		super(nome, precoBase);
		this.unidades = unidades;
	}

	@Override
	double pagar() {
		return unidades * precoBase;
	}

}
