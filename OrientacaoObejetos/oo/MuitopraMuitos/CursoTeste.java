package oo.MuitopraMuitos;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
	    Aluno aluno2 = new Aluno("Maria");
	    Aluno aluno3 = new Aluno("Pedro");
	    
	    Curso curso1 = new Curso("Java Completo");
	    Curso curso2 = new Curso("Web Completo");
	    Curso curso3 = new Curso("React Native");
	    
	    curso1.adicionarAlluno(aluno1);
	    curso1.adicionarAlluno(aluno2);
	    
	    curso2.adicionarAlluno(aluno1);
	    curso2.adicionarAlluno(aluno3);
	    
	    aluno1.adicionarCurso(curso3);
	    aluno2.adicionarCurso(curso3);
	    aluno3.adicionarCurso(curso3);
	    
	    for(Aluno aluno : curso3.alunos) {
	    	System.out.println("Estou Matriculado no curso" + curso3.nome + "...");
	    	System.out.println("e o meu nome é " + aluno.nome);
	    	System.out.println();
	    }
	    
	    System.out.println(aluno1.cursos.get(0).alunos);
	    
	   Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
	   if(cursoEncontrado != null) {
		   System.out.println(cursoEncontrado.nome);
		   System.out.println(cursoEncontrado.alunos);  	   
	      }
	   }
	}
	
	


