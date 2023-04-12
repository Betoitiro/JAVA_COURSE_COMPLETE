package DESAFIOS_metodoseclasses;

public class DESAFIO_METODO_DATA {
	 
	
	//clase para onjetos
	int dia;
	int mes;
	int ano;
	
	//metodos 
	String dataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	void impdataFormatada () {
		System.out.printf("%d/%d/%d", dia,mes,ano); //duas maneiras de usar a estrutura de formatr
		//esse metodo void, so retorna em console.		
		//para usar em aplicações desktop é mais usual o modelo String
	}
}
