package metodos;

public class PessoaTeste {
	
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa("Pedro", "braga", -30);
		p1.setAge(230);                            // alterar ( to alter )
		
		System.out.println(p1.getAge()); // ler (to read)
		System.out.println(p1); // toString
		System.out.println(p1.getFullName()); // metodo nome completo  
	}

}
