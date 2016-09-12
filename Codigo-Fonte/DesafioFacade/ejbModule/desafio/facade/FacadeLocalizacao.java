package desafio.facade;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import desafio.localizacao.LocalizacaoVO;

/**
 * Session Bean implementation class FacadeLocalizacao
 */
@Stateless(mappedName = "ejb/DesafioFacade")
public class FacadeLocalizacao implements FacadeLocalizacaoRemote {

	@EJB
	private desafio.ejb.manager.LocalizacaoSessionRemoteHome home_ejbLocalizacaoSession;
	private desafio.ejb.manager.LocalizacaoSessionRemote ejbLocalizacaoSession;

	@PostConstruct
	protected void inicializa() {
		try {
			ejbLocalizacaoSession = home_ejbLocalizacaoSession.create();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public LocalizacaoVO obterLocalizacoes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public LocalizacaoVO atualizarLocalizacoes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void eliminarLocalizacoes() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
