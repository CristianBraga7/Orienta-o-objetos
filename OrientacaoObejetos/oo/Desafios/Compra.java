package oo.Desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	Cliente cliente;
	
	final List<Item> itens = new ArrayList<Item>();
	
	
	// Método para adicionar um item a compra
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
			
		}
		
		return total;
		
	}

}
