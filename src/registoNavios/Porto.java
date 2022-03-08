package registoNavios;

import java.util.ArrayList;
import java.util.List;

public class Porto 
{
	List<Navio> navios;

	
	/**
	 * @param navios
	 */
	public Porto() {
		this.navios = new ArrayList<Navio>();
	}
	
	/**
	 * @param navios
	 */
	public Porto(List<Navio> navios) {
		this.navios = navios;
	}
	
	public boolean addNavio (Navio navio)
	{
		boolean existe = false;
		
		for (Navio nav1 :navios)
		{
			if (nav1.getId() == navio.getId()) existe = true;
		}
		
		if (!existe) navios.add(navio);
		
		return !existe;
	}

	/**
	 * @return the navios
	 */
	public List<Navio> getNavios() {
		return navios;
	}

	/**
	 * @param navios the navios to set
	 */
	public void setNavios(List<Navio> navios) {
		this.navios = navios;
	}
	
	
}
