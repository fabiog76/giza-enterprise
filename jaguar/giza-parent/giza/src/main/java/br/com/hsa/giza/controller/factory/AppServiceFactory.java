/* Jaguar-jCompany Developer Suite. Powerlogic 2010-2014. Please read licensing information or contact Powerlogic 
 * for more information or contribute with this project: suporte@powerlogic.com.br - www.powerlogic.com.br        */ 
package br.com.hsa.giza.controller.factory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


/**
 * Classe de factory para servir como f�brica de cria��o de classes utilit�rias
 */
@Named("AppServiceFactory")
@ApplicationScoped
public class AppServiceFactory {
	
	/**
	 *
	 * jCompany 6.0.0 - Exemplo de m�todo para gerar PlcEntityUtil
	 *
	@Factory(value="entityComunsUtil")
	public PlcEntityUtil geraEntidadeService() {
		return (PlcEntityUtil)Component.getInstance("AppMinhaEntidadeService",true);

	}
	*/ 

}
