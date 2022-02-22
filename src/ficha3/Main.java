package ficha3;

import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* testes casa */
		Casa casa1 = new Casa();
		Casa casa2 = new Casa("Funchal");
		Casa casa3 = new Casa("Câmara de Lobos");

		casa1.setMorada("Caniço");

		casa1.setPrecoCusto(1750);
		casa2.setPrecoCusto(2550);
		casa3.setPrecoCusto(3200);

		casa1.setPrecoVenda(2000);
		casa2.setPrecoVenda(3000);
		casa3.setPrecoVenda(4500);

		System.out.println(casa1);
		System.out.println(casa2);
		System.out.println(casa3);
		
		

		
		  /**
		   * testes banco 
		   */
		  
		  Banco banco = new Banco("Banco Nacional Javanês"); 
		  
		  System.out.println("\nBanco Nacional Javanês criado com sucesso. Pode agora criar a sua primeira conta!\n");
		  
		  banco.addCasa(casa1);
		  banco.addCasa(casa2);
		  banco.addCasa(casa3);
		  
		  System.out.println("Casas adicionadas ao banco com sucesso");
		  
		  // Esta existe, imprime
		  System.out.println(banco.getCasaByMorada("Funchal"));
		  // Esta não existe, retorna null
		  System.out.println(banco.getCasaByMorada("Santana"));
		  
		  System.out.println(banco.remCasaByMorada("Funchal")); // True, pq existe
		  System.out.println(banco.remCasaByMorada("Santana"));	// False, pq n existe
		  
		  System.out.println(banco.remCasaByMorada("Funchal")); // False, pq já n existe
		  
		  
			/*
			 * System.out.println("Introduza o nome do titular:");
			 * 
			 * ContaBancaria contaBancaria = new ContaBancaria(sc.nextLine());
			 * 
			 * System.out.println("Conta \"" + contaBancaria.getTitular() +
			 * "\"criada com sucesso.");
			 * 
			 * System.out.println(contaBancaria.getInformacaoConta());
			 * 
			 * banco.criaConta(contaBancaria);
			 * System.out.println("Conta adicionada ao banco com sucesso.");
			 * 
			 * 
			 * int opcao = 0;
			 * 
			 * boolean ok = true; do { System.out.println("\nBemvindo ao " +
			 * banco.getNome());
			 * 
			 * System.out.
			 * println("\nIntroduza o nome do titular da conta que deseja movimentar");
			 * 
			 * String titular = sc.nextLine(); System.out.println("\nMovimentando a conta: "
			 * + titular); System.out.println(banco.getConta(titular).getInformacaoConta());
			 * System.out.
			 * println("\nPrima 1 para depositar, 2 para levantar, ou 3 para sair:");
			 * 
			 * opcao = sc.nextInt();
			 * 
			 * if (opcao == 1) { System.out.println("Introduza o valor a depositar:");
			 * 
			 * banco.getConta(titular).depositar(sc.nextDouble()); sc.nextLine(); } else if
			 * (opcao == 2) { System.out.println("Introduza o valor a levantar:");
			 * 
			 * if (banco.getConta(titular).levantar(sc.nextDouble()) != true) {
			 * System.out.println("Saldo insuficiente."); } sc.nextLine(); } else if (opcao
			 * == 3) { ok = false; break; }
			 * 
			 * System.out.println(banco.getConta(titular).getInformacaoConta()); } while
			 * (ok);
			 */
		 

		sc.close();
	}

}
