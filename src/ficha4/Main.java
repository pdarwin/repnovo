package ficha4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrutaPeso maca = new FrutaPeso("Maçã", 1, 2.5);
		
		System.out.print("Tem a pagar " + maca.pagar() + "€"); 
	}

}
