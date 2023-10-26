package Atividade_Faculdade;

import java.util.ArrayList;

public class CadastrarPessoa {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void cadastrarPessoa(Pessoa p) {
		pessoas.add(p);
		System.out.println("Pessoa cadastrada com sucesso!!");
	}
	
	public void status() {
		for (Pessoa p : pessoas) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
		}
	}
}
