package ficha4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testando Ex.� 1"); 
		FrutaPeso maca = new FrutaPeso("Ma��", 1, 2.5);
		
		System.out.println("Tem a pagar " + maca.pagar() + "�");
		
		System.out.println("\nTestando Ex.� 2"); 
		
		FrutaPeso laranja = new FrutaPeso("Laranja", 1.2, 5.45);
		FrutaPeso cereja = new FrutaPeso("Cereja", 3.6, 2.3);
		
		FrutaUnidade ananas = new FrutaUnidade ("Anan�s",4.56,2);
		FrutaUnidade ananasAcores = new FrutaUnidade ("Anan�s dos A�ores",5.1,3);
		
		FrutaVolume polpaMaracuja = new FrutaVolume("Polpa de Maracuj�", 6.3, 2.1);
		
		Cesto cesto = new Cesto();
		
		cesto.addFruta(maca);
		cesto.addFruta(laranja);
		cesto.addFruta(cereja);
		cesto.addFruta(ananas);
		cesto.addFruta(ananasAcores);
		cesto.addFruta(polpaMaracuja);
		
		System.out.println("Cesto criado; frutas adicionadas ao cesto.");
		
		System.out.println("Rela��o de n�mero de frutas por tipo:.");
		System.out.println("Fruta a Peso: " + cesto.getNumFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta a Unidade: " + cesto.getNumFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta a Volume: " + cesto.getNumFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\nValor total das frutas por tipo:.");
		System.out.println("Fruta a Peso: " + cesto.getTotalFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta a Unidade: " + cesto.getTotalFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta a Volume: " + cesto.getTotalFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\nTestando Ex.� 3");
		
		
		maca = new FrutaPeso("Ma��", 10, 1);
		
		maca.setPercentagemDesconto(10);
		
		System.out.println(maca.pagar());
		
		polpaMaracuja = new FrutaVolume("Polpa de Maracuj�", 20, 1);
		
		System.out.println("Pagar sem desconto:" + polpaMaracuja.pagar());
		
		polpaMaracuja.setPercentagemDesconto(5);	
		
		System.out.println("Pagar com desconto:" + polpaMaracuja.pagar());
	}

}
