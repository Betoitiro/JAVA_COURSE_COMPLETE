package METODOS_CLASSES;

public class classe_data01 {
	
	int data;
	int mes; //para conseguir usar a data da maneira convencional, 11/11/11
			//o mes que no caso seria string, tem que estar como int
	int ano;

	
	classe_data01 (int ndata, int nmes, int nano) {
		data = ndata;
		mes = nmes;
		ano = nano;
	}
	
	classe_data01 (){
		
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", data,mes,ano);
	}
}


