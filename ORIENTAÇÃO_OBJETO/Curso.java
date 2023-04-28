package ORIENTAÇÃO_OBJETO;

import java.util.ArrayList;

public class Curso {

	//final serve para deixar o nome e a lista como constante
	
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<>(); //bilateral, ou seja ambas as classes estão ligadas
	//uma lista constante, é uma lista que foi instaciada na memoria

	Curso(String nome){
		this.nome = nome;
	}
	
	
	//metodo dentro de curso para adicionar aluno
	void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
