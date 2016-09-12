package desafio.localizacao;

import java.io.Serializable;

import desafio.tipoEquipamento.TipoEquipamentoVO;
import desafio.usuario.UsuarioVO;

public class LocalizacaoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LocalizacaoVO() {}
	
	protected Integer 	id;
	protected String 	codigoLocalizador;
	protected UsuarioVO responsavel;
	protected UsuarioVO	viceResponsavel;
	protected TipoEquipamentoVO[] listaTiposEquipamentos;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoLocalizador() {
		return codigoLocalizador;
	}
	public void setCodigoLocalizador(String codigoLocalizador) {
		this.codigoLocalizador = codigoLocalizador;
	}
	public UsuarioVO getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(UsuarioVO responsavel) {
		this.responsavel = responsavel;
	}
	public UsuarioVO getViceResponsavel() {
		return viceResponsavel;
	}
	public void setViceResponsavel(UsuarioVO viceResponsavel) {
		this.viceResponsavel = viceResponsavel;
	}
	public TipoEquipamentoVO[] getListaTiposEquipamentos() {
		return listaTiposEquipamentos;
	}
	public void setListaTiposEquipamentos(TipoEquipamentoVO[] listaTiposEquipamentos) {
		this.listaTiposEquipamentos = listaTiposEquipamentos;
	}

	
	

	
	
}
