package ORIENTAÇÃO_OBJETO;

import java.util.ArrayList;

public class Aluno {

	//final serve para deixar o nome e a lista como constante
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>(); //bilateral, ou seja ambas as classes estão ligadas
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	//metodo dentro de aluno para curso
	
	 void addCurso(Curso curso){
		this.cursos.add(curso);
			curso.alunos.add(this);
	}
	 
	 Curso obterCurso(String nome) {
		 
		 for(Curso curso : this.cursos) {
			 if (curso.nome.equalsIgnoreCase(nome)) {
				 return curso;
			 }
		 }
		 
		 
		 return null;
	 }
	 public String toString() { //metodo usado para converter objet em string
		 return "meu nome é " + nome;
	 }
}
