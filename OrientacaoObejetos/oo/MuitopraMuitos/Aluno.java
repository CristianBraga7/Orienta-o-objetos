package oo.MuitopraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
		
	final String nome;
	
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
		
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	// metodo procurar curso por nome
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
		   }
		}
		return null;
	}
	
	//O método toString é sobrescrito para retornar o valor de nome
	public String toString() { 
		return nome;
	}
}
