package registoNavios;

import java.util.Date;

public class PortaContentores extends Navio {

	private int maxContentores;
	
	/**
	 * @param id
	 * @param nome
	 * @param anoConstrucao
	 * @param comprimento
	 * @param maxContentores
	 */
	public PortaContentores(String id, String nome, Date anoConstrucao, float comprimento, int maxContentores) {
		super(id, nome, anoConstrucao, comprimento);
		this.maxContentores = maxContentores;
	}

	/**
	 * @return the maxContentores
	 */
	public int getMaxContentores() {
		return maxContentores;
	}

	/**
	 * @param maxContentores the maxContentores to set
	 */
	public void setMaxContentores(int maxContentores) {
		this.maxContentores = maxContentores;
	}

	@Override
	public String toString() {
		return "PortaContentores [getId()=" + getId() + ", getNome()=" + getNome() + ", getAnoConstrucao()="
				+ getAnoConstrucao() + ", getComprimento()=" + getComprimento() + ", maxContentores=" + maxContentores
				+ "]";
	}
	

}
