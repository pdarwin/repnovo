package ficha3;

import java.io.NotActiveException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza o nome do titular:");
		
		ContaBancaria contaBancaria = new ContaBancaria(sc.nextLine());
		
		System.out.println("Conta criada com sucesso.");
		
		System.out.println(contaBancaria.getInformacaoConta());
	
		
		int opcao = 0;
		
		while (true)
		{
			System.out.println("Prima 1 para depositar, 2 para levantar, ou 3 para sair:");
			
			opcao = sc.nextInt();
			
			if (opcao == 1)
			{
				System.out.println("Introduza o valor a depositar:");
		
				contaBancaria.depositar(sc.nextDouble());
			}
			else if (opcao == 2)
			{
				System.out.println("Introduza o valor a levantar:");
				
				if (contaBancaria.levantar(sc.nextDouble()) != true)
				{
					System.out.println("Saldo insuficiente.");
				}
				
			}
			else if (opcao == 3)
			{
				break;
			}
			
			System.out.println(contaBancaria.getInformacaoConta());
		}
		
		sc.close();
	}

}
