package DESAFIOS_PESSOAIS;


public class Roteirof {
	
	public static void main(String[] args) {
		
		primeirav v1 = new primeirav();
		v1.cidade = "Paris";
		v1.dias = 18;
		v1.hospedagem = 1800;
		v1.passagem = 7500;
		
		System.out.println("Segue o roteiro e os gastos da sua primeira viagem: ".toUpperCase());
		System.out.println();
		System.out.println(v1.intro()); //apresentação do conograma
		
		//informação do custo
		System.out.println("o valor gasto diarias é R$" + v1.diarias() + "o valor gasto com hospedagem é de R$" + v1.hospedagem +
				"o valor gasto com passagem é de R$" + v1.passagem);
		System.out.println();//quebra de linha
		
		//valor total 
		System.out.println("O valor total a ser gasto é de R$" + v1.total());
		
		System.out.println();//quebra de linha 
		
		System.out.println("Segue o roteiro e os gastos da sua seguda viagem: ".toUpperCase());
		
		segundav v2 = new segundav();
		v2.cidade = "Mari";
		v2.hospedagem = 8000;
		v2.passagem = 6000;
		v2.dias = 8;
		v2.prejuizo = 1500;
		
		System.out.println();//quebra de linha
		System.out.println(v2.intro2());
		
		System.out.println("o valor gasto diarias é R$" + v2.diariras() + "o valor gasto com hospedagem é de R$" + v2.hospedagem +
				"o valor gasto com passagem é de R$" + v2.passagem + "voce podera ter um prejuizo de " + v2.prejuizo +"devido ao cambio e receita");
		
		
		System.out.printf("ja na segunda viagem tera um gasto total de R$" + v2.total());
		
		
		System.out.println();//quebra de linha
		System.out.println("Agora segue o roteiro e possiveis gastos da sua proxima viagem: ".toUpperCase());
		System.out.println();//quebra de linha
		
		terceirav v3 = new terceirav();
		v3.cidade = "Lisboa";
		v3.passagem = 5000;
		v3.hospedagem = 8800;
		v3.dias = 15;
		v3.compras = 4560;
		v3.multas = 3000;
		
		System.out.println(v3.intro3());
		
		System.out.println("o valor gasto diarias é R$" + v3.dias + "o valor gasto com hospedagem é de R$" + v3.hospedagem +
				"o valor gasto com passagem é de R$" + v3.passagem + "voce podera levar aproximadamente R$" + v3.multas + " e aproximadamente R$"
						+v3.compras +  "em compras");
		
		System.out.println();//quebra de linha
		
		System.out.println("Esssa viagem tera um gasto total de R$"+ v3.total());
		
		System.out.println();//quebra de linha
		
		System.out.println("vamos calcular o total que sera gasto nas 3 viagens".toUpperCase());
		System.out.println();
		
		double soma = v1.total() + v2.total() + v3.total();
		
		System.out.printf("O valor gasto nas 3 viagens sera de R$%.2f", soma);
		System.out.println();
		System.out.println();
		
		System.out.println("Espero que aproveite seu cronograma de viagem!!".toUpperCase());
		
		
		
		
		
		
		
		
		
		}
		
	}

