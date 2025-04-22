package metodos;

public class Pessoa {
	
	private String name;
	private String surname;
	private int age;
	
	
	public Pessoa(String name, String surname, int age) {
	    setName(name);
	    setSurname(surname);
	    setAge(age);
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	// metodo Getter
	public String getName() {
		return name;
	}
	//metodo Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname();
	}

	
	// metodo Getter
	public int getAge() {    //ler idade
		return age;
	}
	

	public void setAge(int newAge) { // alterar idade
		newAge = Math.abs(newAge);
		if(newAge >= 0 && newAge <= 110) {
		this.age = newAge;
		}
	}
	
	@Override
	public String toString() {
		return "Ola eu sou o " + getName() + "e tenho " + getAge() + " anos";
	}
		
}
