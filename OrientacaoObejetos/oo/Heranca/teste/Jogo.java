package oo.Heranca.teste;

import oo.Heranca.Direcao;
import oo.Heranca.Heroi;
import oo.Heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		 Monstro monstro = new Monstro();
		 monstro.x = 10;
		 monstro.y = 10;
		 
		 Heroi heroi = new Heroi(10, 11);
		 //heroi.x = 11;
		 //heroi.y = 10;
		
		 
		 System.out.println("Monstro tem =>" + monstro.vida);
		 System.out.println("Heroi tem =>" + heroi.vida);
		 
		 
		 monstro.atacar(heroi);
		 heroi.atacar(monstro);
		 
		 monstro.atacar(heroi);
		 heroi.atacar(monstro);
		 
		 //se for pra direcao norte vai perder a ranger e nao vai conseguir atacar
		 monstro.andar(Direcao.NORTE);
		 monstro.atacar(heroi);
		 heroi.atacar(monstro);
		 
		
		 
		 System.out.println("Monstro tem =>" + monstro.vida);
		 System.out.println("Heroi tem =>" + heroi.vida);
		 
		 	 
	}

}
