package ficha4;

public class FrutaVolume extends Fruta {

	private double volume;
	
	public FrutaVolume(String nome, double precoBase, double volume) {
		super(nome, precoBase);
		this.volume = volume;
	}


	@Override
	double pagar() {
		return volume * precoBase;
	}

}
