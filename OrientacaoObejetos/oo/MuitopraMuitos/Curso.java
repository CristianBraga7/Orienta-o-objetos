package oo.MuitopraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String nome;
        List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAlluno(Aluno aluno) {
		this.alunos.add(aluno);
        aluno.cursos.add(this);		
	}

}
