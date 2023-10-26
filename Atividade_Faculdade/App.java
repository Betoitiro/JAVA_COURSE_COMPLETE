package Atividade_Faculdade;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		CadastrarPessoa c1 = new CadastrarPessoa();
		
		System.out.println("Digite seu nome: ");
		p.setNome(sc.next());
		
		System.out.println("Digite sua idade: ");
		p.setIdade(sc.nextInt());
		
		c1.cadastrarPessoa(p);
		
		c1.status();
		
		
	}

}
