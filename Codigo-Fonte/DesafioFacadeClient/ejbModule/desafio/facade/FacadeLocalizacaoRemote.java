package desafio.facade;

import javax.ejb.Remote;

import desafio.localizacao.LocalizacaoVO;

@Remote
public interface FacadeLocalizacaoRemote {
	
	LocalizacaoVO obterLocalizacoes() throws Exception;
	
	LocalizacaoVO atualizarLocalizacoes() throws Exception;
	
	void eliminarLocalizacoes() throws Exception;

}
