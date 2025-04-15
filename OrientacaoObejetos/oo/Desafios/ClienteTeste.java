package oo.Desafios;

public class ClienteTeste {
	
	public static void main(String[] ards ) {

	Compra compra1 = new Compra();
	compra1.adicionarItem("Caneta", 9.67, 100);
	compra1.adicionarItem(new Produto("Notebook", 1893.88), 2);
	
	Compra compra2 = new Compra();
	compra2.adicionarItem("Caderno", 19.90, 2);
	compra2.adicionarItem(new Produto("Impressora", 900.98), 1);
	
	
	Cliente cliente = new Cliente("Maria julia");
	cliente.adicionarCompra(compra1);
	cliente.adicionarCompra(compra2);
	
	System.out.println(cliente.obterValorTotal());
	
  }

}
