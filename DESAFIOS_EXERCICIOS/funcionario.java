package DESAFIOS_EXERCICIOS;

import java.time.LocalDate;

public class funcionario {
	
	public static void main(String[] args) {
		
		LocalDate admissao = LocalDate.of(2020, 04, 15);
		dfuncionario f1 = new dfuncionario();
		f1.nome ="humberto";
		f1.salario = 7500;
		f1.admissao = admissao;
		
		int tmpService = f1.calcularts();
		System.out.printf("o tempo de serviço do funcionario " + f1.nome + " é de " + tmpService +" ano(s)");
		
		System.out.println();//quebra de linha
		
		double csa = f1.sa(1500);
		System.out.printf("o decimo terceiro salario, com "
				+ "a bonificação é de R$%.2f ", csa);
		System.out.println();
		System.out.println();
		
		LocalDate admissao2 = LocalDate.of(2020, 03, 13);
		dfuncionario f2 = new dfuncionario();
		f2.nome = "remerson";
		f2.salario = 7400;
		f2.admissao  = admissao2;
		
		int tmp = f1.calcularts();
		System.out.printf("o tempo de serviço do funcionario " + f2.nome + " é de " + tmp +" ano(s)");
		System.out.println(); //linha
		
		double csa2 = f2.sa(1500);
		System.out.printf("o decimo terceiro salario, com "
				+ "a bonificação é de R$%.2f ", csa2);
	}
}
