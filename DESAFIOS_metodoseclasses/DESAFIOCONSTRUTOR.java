package DESAFIOS_metodoseclasses;

public class DESAFIOCONSTRUTOR {
	
	int dia;
	int mes;
	int ano;
	
	// dados do construtor
	
	
	DESAFIOCONSTRUTOR (){
		dia = 1;
		mes = 1;
		ano = 1970;
		
		//caso o parentese do construtor fique como padrão, os seus dados fiarão os dados acima!!
	}

	DESAFIOCONSTRUTOR (int diaIN, int mesIN, int anoIN){
		dia = diaIN;
		mes = mesIN;
		ano = anoIN;
	}
	
	//formatação da data
	
	String DataFormat() {
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}

}
