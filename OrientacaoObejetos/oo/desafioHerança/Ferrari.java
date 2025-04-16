package desafioHerança;

public class Ferrari extends Carro {
	
	
	Ferrari(){
		this(320);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 500;
	}

	//@Override
	//void acelerar() {
		//velocidadeAtual += 15;
	//}
	
	
}