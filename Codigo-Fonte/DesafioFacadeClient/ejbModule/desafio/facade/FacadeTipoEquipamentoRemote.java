package desafio.facade;

import javax.ejb.Remote;

import desafio.tipoEquipamento.TipoEquipamentoVO;

@Remote
public interface FacadeTipoEquipamentoRemote {
	
	TipoEquipamentoVO obterTipoEquipamentos() throws Exception;
	
	TipoEquipamentoVO atualizarTipoEquipamentos() throws Exception;
	
	void eliminarTipoEquipamentos() throws Exception;

}
