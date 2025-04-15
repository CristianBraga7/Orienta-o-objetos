package oo.UmpraUm;

public class Carro {
	
	//final enfrente a uma variavel, é quando a variavel nao pode ser alterada
	final Motor motor;
	
	// esse "this" referenciar um atributo externo fora do método  Carro 
	Carro(){
		this.motor = new Motor(this);  
	}
	
	void acelerar () {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao >0.5) {
			motor.fatorInjecao -=0.4;
		}
		
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
		
	}
	
	boolean estarLigado() {
		return motor.ligado;
	}

}
