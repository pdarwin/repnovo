package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {

	private final int limite = 100;
	
	private int totalItens;
	
	private List<Fruta> frutas;
	
	public Cesto() 
	{
		frutas = new ArrayList<Fruta>(limite);
		totalItens = 0;
	}
	
	public void addFruta (Fruta fruta)
	{
		frutas.add(fruta);
	}

	public double calculaTotal ()
	{
		double total = 0;
		for (Fruta fruta : frutas)
		{
			total += fruta.pagar();
		}
		
		return total;
	}
	
	public int getNumFrutosFromNome (String nome)
	{
		int total = 0;
		for (Fruta fruta : frutas)
		{
			if (fruta.getNome().equals(nome)) total++;
		}
		
		return total;
	}
	
	public double getTotalFrutosFromNome (String nome)
	{
		double total = 0;
		for (Fruta fruta : frutas)
		{
			if (fruta.getNome().equals(nome)) total += fruta.pagar();
		}
		
		return total;
	}
	
}
