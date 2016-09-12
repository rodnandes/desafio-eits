package desafio.tipoEquipamento;

import java.io.Serializable;
import java.util.Date;

public class TipoEquipamentoVO implements Serializable {

	static final long serialVersionUID = 1L;

	public TipoEquipamentoVO() {
	}

	protected Integer id;
	protected String nome;
	protected Float peso;
	protected Date validade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

}
