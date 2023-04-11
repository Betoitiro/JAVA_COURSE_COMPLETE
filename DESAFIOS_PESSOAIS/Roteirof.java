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
		
		System.out.println("Agora segue o roteiro e possiveis gastos da sua proxima viagem: ".toUpperCase());
		
		terceirav v3 = new terceirav(String "Lisboa", double 5500, double 7500, int 15, double 3000, double 4550);
		
		
		
		
		
		
		
		
		
		}
		
	}

