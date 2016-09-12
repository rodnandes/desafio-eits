package desafio.facade;

import javax.ejb.Stateless;

import desafio.tipoEquipamento.TipoEquipamentoVO;

/**
 * Session Bean implementation class FacadeTipoEquipamento
 */
@Stateless(mappedName = "ejb/DesafioFacade")
public class FacadeTipoEquipamento implements FacadeTipoEquipamentoRemote {

    /**
     * Default constructor. 
     */
    public FacadeTipoEquipamento() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public TipoEquipamentoVO obterTipoEquipamentos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEquipamentoVO atualizarTipoEquipamentos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarTipoEquipamentos() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
