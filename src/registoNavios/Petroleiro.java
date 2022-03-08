package registoNavios;

import java.util.Date;

public class Petroleiro extends Navio
{
	private float capacidadeCarga;

	/**
	 * @param id
	 * @param nome
	 * @param anoConstrucao
	 * @param comprimento
	 * @param capacidadeCarga
	 */
	public Petroleiro(String id, String nome, Date anoConstrucao, float comprimento, float capacidadeCarga) {
		super(id, nome, anoConstrucao, comprimento);
		this.capacidadeCarga = capacidadeCarga;
	}

	/**
	 * @return the capacidadeCarga
	 */
	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}

	/**
	 * @param capacidadeCarga the capacidadeCarga to set
	 */
	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return "Petroleiro [getId()=" + getId() + ", getNome()=" + getNome() + ", getAnoConstrucao()="
				+ getAnoConstrucao() + ", getComprimento()=" + getComprimento() + ", capacidadeCarga=" + capacidadeCarga
				+ "]";
	}

	
}
