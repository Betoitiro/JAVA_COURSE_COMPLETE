package EXERCICIOS;

import java.util.Scanner;

public class gestão_empresarial {
	
	public static void main(String[] args) {
			
			// o sistema tem o objetivo de solicitar o nome da empresa e seu arrecadamento total
			//o sistema tem como objetivo calcular a media salarial dos funcionarios da empresa
			//apresentar se teve lucro ou prejuizo, respeitando a regra que uma margem inferior 50% do arrecadamento é lucro e superior prejuizo
			//a empresa deve ter no minimo 11 funcionarios.
			//pode ser usar o metodo construtor se for necessario
			
			Scanner entrada = new Scanner(System.in);
			
			
			System.out.print("Informe o nome da empresa: ");
			String empresa = entrada.nextLine();
			
			System.out.print("Informe o arrecadamento total da empresa no mes: ");
			double arrecadamento = entrada.nextDouble();
			
			System.out.print("informe a quantidade de funcionarios: ");
			int funcionarios = entrada.nextInt();
			if (funcionarios >= 11){
				System.out.print("informe quantos salarios são dados por mês: ");
				int salario = entrada.nextInt();
				if (salario >=2){
					double [][] Msalario = new double [funcionarios][salario];
					
					double total = 0;
					for (int i = 0; i < Msalario.length; i++) {
						for (int j = 0; j < Msalario[i].length; j++) {
							System.out.printf("Informe o salario %d do funcionario %d: "
									,i + 1,j +1);
							Msalario[i][j] = entrada.nextDouble();
							total += Msalario[i][j];
						}
					}
					
					double media = total/(funcionarios/salario);
					System.out.printf("A media salario dos funcionarios da empressa %s é %.2f"
							, empresa.toUpperCase(), media);
					
					System.out.println();//quebra de linha
					
					double status = (arrecadamento / total) * 100.00;
					if (status>50) {
						System.out.printf("a empresa teve um apurado de R$%.2f e uma media de gasto com funcionario de R$%.2f,\n "
								+ "porem o percentual de gasto não ultraassou a medida de 50 porcento estabelecida pelo sistema!\n"
								+ "Nesse sentido, não teve prejuizo!", arrecadamento,total);
					}else {
						System.out.println("Os gastos com funcionarios foram alem do esperado\n"
								+ "nesse sentido a empresa possui um prejuizo superior a 50 porcento");
					}
					
				}else {
					System.out.println("quantidade salario invalida");
				}
				
			}else {
				System.out.println("quantidade de funcionarios invalida");
			}
			
		
		
			
			entrada.close();
			
		}

		}



