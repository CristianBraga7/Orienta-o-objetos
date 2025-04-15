package oo.UmpraMuitos;

import java.util.ArrayList;

public class Compras {
	
	
	String cliente;
	
	// uma compra tem muitos intens e um intem tem uma compra 
	// relacao unidirecional
	ArrayList<Item> intens = new ArrayList <Item>();
	
	//relacao bidimencional
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.intens.add(item);
		item.compra = this;
	}
	
	
	double GetvalorTotal() {
		double total = 0;
		
		for(Item item: intens) {
			total += item.quantidade * item.preco;
			
		}
		
		return total;
	}

}
