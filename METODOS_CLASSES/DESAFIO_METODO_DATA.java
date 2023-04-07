package METODOS_CLASSES;

public class DESAFIO_METODO_DATA {
	 
	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	void impdataFormatada () {
		System.out.printf("%d/%d/%d", dia,mes,ano); //duas maneiras de
													//usar a estrutura de formatr
	}
}
