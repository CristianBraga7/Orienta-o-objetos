package oo.UmpraUm;

public class Motor {
	
	final Carro carro;
	double fatorInjecao = 1;
	boolean ligado = false;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
		return(int) Math.round(fatorInjecao * 3000); //Math.roud é usado para arredondar um número para o inteiro mais próximo
		}
	}

}
