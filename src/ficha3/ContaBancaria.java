package ficha3;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {
	
	private String titular; 
	private double saldo = 0.0;
	private Date dataAbertura =  new Date();
	
	public ContaBancaria(String titular) {
		super();
		this.titular = titular;
		/*
		 * DateFormat df = new SimpleDateFormat("dd/M/yyyy"); try { this.dataAbertura =
		 * df.parse("31/12/2021"); } catch (ParseException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
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
	
	@Override
	public String toString ()
	{
		DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		DecimalFormat decF = new DecimalFormat("0.00");
		
		return "Titular: " + titular + "| Saldo: €" + decF.format(saldo) +
				"| Data Abertura: " + df.format(dataAbertura);
	}

	// método getInformaçãoConta() que retorna uma String com o titular,
	// o saldo da conta com duas casas decimais e a data de abertura da conta no formato
	// DD/MM/YYYY. Ex.: Titular: José Fonseca Saldo: €321.50 Data Abertura: 21/2/2017.
	public String getInformacaoConta(){
		
		return this.toString();
		
	}
	
	// método depositar(…) que recebe o valor a depositar na conta (double) e atualiza
	// o respetivo saldo.
	public void depositar(double aValor){
		
		saldo += aValor;
	}
	
	// método levantar(…) que recebe o valor a levantar da conta (double) e atualiza o
	// respetivo saldo. Não devem ser permitidos levantamentos que coloquem o saldo
	// negativo.
	public boolean levantar(double aValor){
		
		if ((saldo - aValor) >= 0)
		{
			saldo -= aValor;
			return true;
		}
		else return false;
	}
	
	 /*


	Escreva a função main() para testar a classe ContaBancária. Crie uma conta, efetue
	depósitos e levantamentos e imprima no ecrã a informação da conta sempre que atualiza o
	saldo. */

}
