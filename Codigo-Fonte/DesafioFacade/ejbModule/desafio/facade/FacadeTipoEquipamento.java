package desafio.facade;

import javax.ejb.Stateless;

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

}
