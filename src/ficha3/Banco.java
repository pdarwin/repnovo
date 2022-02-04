package ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<ContaBancaria> contasBancarias;
	
	/**
	 * Construtor do banco
	 * @param nome - nome do banco
	 */
	public Banco(String nome) {
		super();
		this.nome = nome;
		contasBancarias = new ArrayList<ContaBancaria>(100);
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
}
