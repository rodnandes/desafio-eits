package desafio.facade;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class FacadeLocalizacao
 */
@Stateless(mappedName = "ejb/DesafioFacade")
public class FacadeLocalizacao implements FacadeLocalizacaoRemote {

    /**
     * Default constructor. 
     */
    public FacadeLocalizacao() {
        // TODO Auto-generated constructor stub
    }

}
