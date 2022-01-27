package ficha3;

public class Banco {

	private String nome;
	private ContaBancaria contas[];
	
	public Banco(String nome) {
		super();
		this.nome = nome;
		this.contas = new ContaBancaria [100];
	}
	
	public ContaBancaria[] getContas ()
	{
		return contas;
	}
	
	public void setContas (ContaBancaria[] contas)
	{
		this.contas = contas;
	}
	
	public void criaConta (ContaBancaria conta)
	{
		contas [contas.length] = conta;
	}
	
	public ContaBancaria getConta (String titular)
	{
		ContaBancaria contaBancaria = null;
		for (int i = 0; i < contas.length; i++)
		{
			if (contas[i].getTitular() == titular)
			{
				contaBancaria = contas[1];
			}
		}
		
		return contaBancaria;
	}
	
}
