package ficha4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testando Ex.º 1"); 
		FrutaPeso maca = new FrutaPeso("Maçã", 1, 2.5);
		
		System.out.println("Tem a pagar " + maca.pagar() + "€");
		
		System.out.println("\nTestando Ex.º 2"); 
		
		FrutaPeso laranja = new FrutaPeso("Laranja", 1.2, 5.45);
		FrutaPeso cereja = new FrutaPeso("Cereja", 3.6, 2.3);
		
		FrutaUnidade ananas = new FrutaUnidade ("Ananás",4.56,2);
		FrutaUnidade ananasAcores = new FrutaUnidade ("Ananás dos Açores",5.1,3);
		
		FrutaVolume polpaMaracuja = new FrutaVolume("Polpa de Maracujá", 6.3, 2.1);
		
		Cesto cesto = new Cesto();
		
		cesto.addFruta(maca);
		cesto.addFruta(laranja);
		cesto.addFruta(cereja);
		cesto.addFruta(ananas);
		cesto.addFruta(ananasAcores);
		cesto.addFruta(polpaMaracuja);
		
		System.out.println("Cesto criado; frutas adicionadas ao cesto.");
		
		System.out.println("Relação de número de frutas por tipo:.");
		System.out.println("Fruta a Peso: " + cesto.getNumFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta a Unidade: " + cesto.getNumFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta a Volume: " + cesto.getNumFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\nValor total das frutas por tipo:.");
		System.out.println("Fruta a Peso: " + cesto.getTotalFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta a Unidade: " + cesto.getTotalFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta a Volume: " + cesto.getTotalFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\nTestando Ex.º 3");
		
		
		maca = new FrutaPeso("Maçã", 10, 1);
		
		maca.setPercentagemDesconto(10);
		
		System.out.println(maca.pagar());
		
		polpaMaracuja = new FrutaVolume("Polpa de Maracujá", 20, 1);
		
		System.out.println("Pagar sem desconto:" + polpaMaracuja.pagar());
		
		polpaMaracuja.setPercentagemDesconto(5);	
		
		System.out.println("Pagar com desconto:" + polpaMaracuja.pagar());
	}

}
