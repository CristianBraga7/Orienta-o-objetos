package oo.Heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	Jogador(){
		this(0, 0);
	}
	
	
	Jogador(int x, int y){
		this.x = x;
		this.y = x;
	}
	
	boolean atacar(Jogador oponente){
		
		// math.abs se a diferenca for -1 no final vai ser 1
		int deltaX = Math.abs(x - oponente.x); 
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0){
			oponente.vida -= 10;
			return true;
		}else{
			return false;
		}
	
	}
	
	 boolean andar(Direcao direcao) { 
		 switch(direcao) {
		  case NORTE:
		       y--;
		       break;
		  case LESTE:
		       x++;
		       break;
		  case SUL:
		       y++;
		       break;
		  case OESTE:     
		       x--;
		       break;
		 }
		 
		 return true;
	 }

}
  