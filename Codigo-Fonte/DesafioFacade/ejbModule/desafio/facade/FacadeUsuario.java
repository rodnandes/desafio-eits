package desafio.facade;

import javax.ejb.Stateless;

import desafio.usuario.UsuarioVO;

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

	@Override
	public UsuarioVO obterUsarios() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioVO atualizarUsuarios() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuarios() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
