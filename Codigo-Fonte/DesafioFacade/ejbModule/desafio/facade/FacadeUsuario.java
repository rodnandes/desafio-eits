package desafio.facade;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class FacadeUsuario
 */
@Stateless(mappedName = "ejb/DesafioFacade")
public class FacadeUsuario implements FacadeUsuarioRemote {

    /**
     * Default constructor. 
     */
    public FacadeUsuario() {
        // TODO Auto-generated constructor stub
    }

}
