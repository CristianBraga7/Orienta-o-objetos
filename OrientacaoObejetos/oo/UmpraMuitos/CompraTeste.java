package oo.UmpraMuitos;

public class CompraTeste {
	
	public static void main (String[] args) {
	
	  Compras compra1 = new Compras();
	  compra1.cliente= "Joao Pedro";
	  
	  compra1.adicionarItem(new Item("Caneta", 20, 7.45));
	  compra1.adicionarItem(new Item("Borracha", 12, 3.89));
	  compra1.adicionarItem(new Item("Caderno", 3, 18.79));

	  System.out.println(compra1.intens.size());
	  System.out.println(compra1.GetvalorTotal());
	  
	  
	  // So pra mostrar a relacao bidirecional!!!
	 double total = compra1.intens.get(0)
	  .compra.intens.get(1).compra.GetvalorTotal();
	 
	 System.out.println("O total é R$" + total);
	  
	}
}
