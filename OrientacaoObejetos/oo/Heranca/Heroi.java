package oo.Heranca;


//extends recebe atributos e comportamentos por heranca
public class Heroi extends Jogador {
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	@Override
public boolean atacar(Jogador oponente){
		
		// math.abs se a diferenca for -1 no final vai ser 1
		//int deltaX = Math.abs(x - oponente.x); 
		//int deltaY = Math.abs(y - oponente.y);
		
		//if(deltaX == 0 && deltaY == 1) {
			//oponente.vida -= 10;
			//return true;
		//}else if(deltaX == 1 && deltaY == 0){
			//oponente.vida -= 20;
			///return true;
		//}else{
			//return false;
		//}
          //metodo definido na sub classe,
	
	 boolean ataque1 = super.atacar(oponente);
	 boolean ataque2 = super.atacar(oponente);
	 boolean ataque3 = super.atacar(oponente);
	 return ataque1 || ataque2 || ataque3;
	}

} 
