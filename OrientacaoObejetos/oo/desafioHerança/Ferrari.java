package oo.desafioHerança;

public class Ferrari extends Carro {
	
	
	public Ferrari(){
		this(320);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 500;
	}

	//@Override
	//void acelerar() {
		//velocidadeAtual += 15;
	//}
	
	
}