/* ************************* META-DADOS GLOBAIS DA APLICA��O ******************************
  ********************** Configura��es padr�o para toda a aplica��o *************************
  ************ Obs: configura��es corporativas devem estar no n�vel anterior,****************
  ************              preferencialmente na camada Bridge               ****************
  *******************************************************************************************/


@PlcConfigApplication(
	definition=@PlcConfigApplicationDefinition(name="giza",acronym="giza",version=1,release=0),
	classesDiscreteDomain={},
	classesLookup={}
)


package com.powerlogic.jcompany.config.app;

import com.powerlogic.jcompany.config.application.PlcConfigApplication;
import com.powerlogic.jcompany.config.application.PlcConfigApplicationDefinition;
