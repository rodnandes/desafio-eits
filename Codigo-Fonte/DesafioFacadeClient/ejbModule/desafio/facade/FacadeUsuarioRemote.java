package desafio.facade;

import javax.ejb.Remote;

import desafio.usuario.UsuarioVO;

@Remote
public interface FacadeUsuarioRemote {
	
	UsuarioVO obterUsarios() throws Exception;
	
	UsuarioVO atualizarUsuarios() throws Exception;
	
	void eliminarUsuarios() throws Exception;

}
