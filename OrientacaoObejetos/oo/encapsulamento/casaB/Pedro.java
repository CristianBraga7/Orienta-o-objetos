package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; //como ana esta em outro pacote precisa ser importado

public class Pedro extends Ana {
	
	void testeAcesso() {	
		 //System.out.println(segredo); private
		 //System.out.println(facoDentroDeCasa); default 
		 System.out.println(formaDeFalar);
		 System.out.println(todosSabem);
	} 
	
}

//Pedro esta recebendo as herancas da mae que é a ana, entao consigo pegar oque é publico e o protected os outros nao consigo pois um é private e o outro é default, so os 
// que estao no mesmo bloco consuegem se ver


