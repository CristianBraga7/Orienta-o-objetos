package oo.desafioHerança;

public class Carro {
	
    //Palavras constantes acaba por padrao sendo maiusculo 
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	 public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
		
	}
	
	
	public void frear() {
		if(velocidadeAtual >= 5) {
	       velocidadeAtual -= 5;	
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual +" KM atual";
	}
}
