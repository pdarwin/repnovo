package ficha3;

import java.util.Date;

public class ContaBancaria {
	
	private String titular; 
	private double saldo = 0.0;
	private Date dataAbertura = new Date();
	
	public ContaBancaria(String titular) {
		super();
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public String getInformacaoConta(){
		
		return "Titular: " + titular;
	}
	
	 /*
	
	f) Um método getInformaçãoConta() que retorna uma String com o titular, o saldo da
	conta com duas casas decimais e a data de abertura da conta no formato
	DD/MM/YYYY. Ex.: Titular: José Fonseca Saldo: €321.50 Data Abertura: 21/2/2017.
	g) Um método depositar(…) que recebe o valor a depositar na conta (double) e atualiza
	o respetivo saldo.
	h) Um método levantar(…) que recebe o valor a levantar da conta (double) e atualiza o
	respetivo saldo. Não devem ser permitidos levantamentos que coloquem o saldo
	negativo.
	Escreva a função main() para testar a classe ContaBancária. Crie uma conta, efetue
	depósitos e levantamentos e imprima no ecrã a informação da conta sempre que atualiza o
	saldo. */

}
