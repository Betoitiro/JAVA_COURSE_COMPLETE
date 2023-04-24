package DESAFIOS_EXERCICIOS;

import java.time.LocalDate;

public class funcionario {
	
	public static void main(String[] args) {
		
		LocalDate admissao = LocalDate.of(2020, 04, 15);
		dfuncionario f1 = new dfuncionario();
		f1.nome ="humberto";
		f1.salario = 1500;
		f1.admissao = admissao;
		
		int tmpService = f1.calcularts();
		System.out.printf("o tempo de serviço do funcionario" + f1.nome + "é de " + tmpService +" ano(s)");
		
		System.out.println();//quebra de linha
		
		double csa = f1.sa(1500);
		System.out.printf("o decimo terceiro salario, com "
				+ "a bonificação é de R$%.2f ", csa);
	}
}
