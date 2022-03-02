package ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<ContaBancaria> contasBancarias;
	private List<Casa> casas;
	
	/**
	 * Construtor do banco
	 * @param nome - nome do banco
	 */
	public Banco(String nome) {
		this.nome = nome;
		contasBancarias = new ArrayList<ContaBancaria>(100);
		casas = new ArrayList<Casa>();
	}
	
	/**
	 * Cria uma conta
	 * @param conta conta a ser criada
	 */
	public void criaConta (ContaBancaria conta)
	{
		contasBancarias.add(conta);
	}
	
	/**
	 * 
	 * @param titular - titular da conta
	 * @return retorna a conta bancária
	 */
	public ContaBancaria getConta (String titular)
	{
		for (ContaBancaria conta : contasBancarias)
		{
			if (conta.getTitular().equals(titular))
			{
				return conta;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return array de contas bancárias
	 */
	public List<ContaBancaria> getContas ()
	{
		return contasBancarias;
	}
	
	/**
	 * 
	 * @param contas - array de contas bancárias
	 */
	public void setContas (List<ContaBancaria> contas)
	{
		this.contasBancarias = contas;
	}
	
	/**
	 * 
	 * @return nome do banco
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Adiciona uma casa à lista de casas do banco
	 * @param casa a ser adicionada
	 */
	public void addCasa (Casa casa)
	{
		casas.add(casa);
	}
	
	/**
	 * 
	 * @param morada -> morada da casa a procurar
	 * @return retorna a casa pela morada
	 */
	public Casa getCasaByMorada (String morada)
	{
		for (Casa casa : casas)
		{
			if (casa.getMorada().equals(morada))
			{
				return casa;
			}
		}
		return null;
	}
	
	/**
	 * Remove uma casa pela morada
	 * @param morada -> morada da casa a remover
	 * @return verdade se removeu, senão falso
	 */
	public boolean remCasaByMorada (String morada)
	{
		if (getCasaByMorada(morada)!= null)
		{
			casas.remove(casas.indexOf(getCasaByMorada(morada)));
			return true;
		}
		return false;
	}
	
}
