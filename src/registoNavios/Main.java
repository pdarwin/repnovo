package registoNavios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) 
	{
		
		SimpleDateFormat of = new SimpleDateFormat("yyyy");
		
		try {
			Navio nav1  = new Navio("FX-1", "Gavião", of.parse("1973") , 10f);
			System.out.println(nav1);
			Navio nav2  = new PortaContentores("FX-2", "Madeirense", of.parse("1981") , 35.69f, 100);
			System.out.println(nav2);
			Navio nav3  = new Petroleiro("FX-3", "Ever Caniçalense", of.parse("2003") , 159.3f, 5608.78f);
			System.out.println(nav3);
			
			Navio nav4  = new Navio("FX-1", "Gavião", of.parse("1973") , 10f);
			System.out.println(nav4);
			
			Porto porto = new Porto();
			System.out.println(porto.addNavio(nav1));
			System.out.println(porto.addNavio(nav2));
			System.out.println(porto.addNavio(nav3));
			System.out.println(porto.addNavio(nav4));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
