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
	
	f) Um m�todo getInforma��oConta() que retorna uma String com o titular, o saldo da
	conta com duas casas decimais e a data de abertura da conta no formato
	DD/MM/YYYY. Ex.: Titular: Jos� Fonseca Saldo: �321.50 Data Abertura: 21/2/2017.
	g) Um m�todo depositar(�) que recebe o valor a depositar na conta (double) e atualiza
	o respetivo saldo.
	h) Um m�todo levantar(�) que recebe o valor a levantar da conta (double) e atualiza o
	respetivo saldo. N�o devem ser permitidos levantamentos que coloquem o saldo
	negativo.
	Escreva a fun��o main() para testar a classe ContaBanc�ria. Crie uma conta, efetue
	dep�sitos e levantamentos e imprima no ecr� a informa��o da conta sempre que atualiza o
	saldo. */

}
