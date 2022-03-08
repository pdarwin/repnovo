package registoNavios;

import java.util.Date;

public class Navio 
{
	private String id;
	
	private String nome;
	
	private Date anoConstrucao;
	
	private float comprimento;

	

	/**
	 * @param id
	 * @param nome
	 * @param anoConstrucao
	 * @param comprimento
	 */
	public Navio(String id, String nome, Date anoConstrucao, float comprimento) {
		this.id = id;
		this.nome = nome;
		this.anoConstrucao = anoConstrucao;
		this.comprimento = comprimento;
	}

	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



	/**
	 * @return the anoConstrucao
	 */
	public Date getAnoConstrucao() {
		return anoConstrucao;
	}



	/**
	 * @param anoConstrucao the anoConstrucao to set
	 */
	public void setAnoConstrucao(Date anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}



	/**
	 * @return the comprimento
	 */
	public float getComprimento() {
		return comprimento;
	}



	/**
	 * @param comprimento the comprimento to set
	 */
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}



	@Override
	public String toString() {
		return "Navio [id=" + id + ", nome=" + nome + ", anoConstrucao=" + anoConstrucao + ", comprimento="
				+ comprimento + "]";
	}
	
	
}
