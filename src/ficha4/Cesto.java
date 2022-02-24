package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {

	/**
	 * 
	 */
	private final int limite = 100;
	
	/**
	 * 
	 */
	private int totalItens;
	
	/**
	 * 
	 */
	private List<Fruta> frutas;
	
	/**
	 * 
	 */
	public Cesto() 
	{
		frutas = new ArrayList<Fruta>(limite);
		totalItens = 0;
	}
	
	/**
	 * 
	 * @param fruta
	 */
	public void addFruta (Fruta fruta)
	{
		frutas.add(fruta);
	}

	/**
	 * 
	 * @return
	 */
	public double calculaTotal ()
	{
		double total = 0;
		for (Fruta fruta : frutas)
		{
			total += fruta.pagar();
		}
		
		return total;
	}
	
	/**
	 * 
	 * @param tipoFruta
	 * @return
	 */
	public int getNumFrutosFromTipo (String tipoFruta)
	{
		int total = 0;
		for (Fruta fruta : frutas)
		{
		
			if (fruta.getClass().getSimpleName().equals(tipoFruta)) total++;
		}
		return total;
	}
	
	/**
	 * 
	 * @param tipoFruta
	 * @return
	 */

	public double getTotalFrutosFromTipo (String tipoFruta)
	{
		double total = 0;
		for (Fruta fruta : frutas)
		{
			if (fruta.getClass().getSimpleName().equals(tipoFruta)) total += fruta.pagar();
		}
		
		return total;
	}
	
}
