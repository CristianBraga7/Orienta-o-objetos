package oo.UmpraUm;

public class CarroTeste {
	
	public static void main(String[] args) {
	
	Carro c1 = new Carro();
	System.out.println(c1.estarLigado());
	
	c1.ligar();
	System.out.println(c1.estarLigado());
	
	System.out.println(c1.motor.giros());
	
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();
	
	System.out.println(c1.motor.giros());
	
	
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	
	//Faltou Encapsulamento!!! 
	
	System.out.println(c1.motor.giros());
	
	// Relaçao bidirecional
	System.out.println(c1.motor.carro.motor.carro.motor.giros());
	
  }
	
}