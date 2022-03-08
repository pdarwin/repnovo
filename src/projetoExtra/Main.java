package projetoExtra;

public class Main {

	public static void main(String[] args) {
		
		String nome = "MadApp";
		
		AppStore store = new AppStore (nome);
		
		printMenu(nome);

	}
	
	public static void printMenu (String nome)
	{
	
		System.out.println("╔=======  Bemvinda/o ao menu da AppStore  =======╗");
		System.out.println("║"+ returnSpaces((45 -nome.length()) /2) + nome + 
					returnSpaces((45 -nome.length()) /2) + "║");	
		System.out.println("╠================================================╣");
		System.out.println("║                                                ║");
		System.out.println("║              Escolha uma opção                 ║");
		System.out.println("╠================================================╣");
		System.out.println("║                                                ║");
		System.out.println("║       0 -Sair                                  ║");
		System.out.println("║                                                ║");
		System.out.println("╚================================================╝");

	}
	
	public static String returnSpaces (int num)
	{
		String spaces = "";
		
		int i;
		for (i = 0; i> num; i++)
		{
			spaces += " ";
		}
		
		return spaces;
	}
	
}
