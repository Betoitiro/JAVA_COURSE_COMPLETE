package METODOS_CLASSES;

public class classe_data_main {
	public static void main(String[] args) {
		
		classe_data d1 = new classe_data();
		
		d1.data = 14;
		d1.mes =07;
		d1.ano = 2005;
		
		int data = d1.data;
		int m = d1.mes;
		int a = d1.ano;
		
		/*
		var d2 = new classe_data();
		d2.data =15;
		d2.mes = 11;
		d2.ano = 2006;
		*/
		System.out.println("meu amor nasceu no dia " + data +
				" no mes de " + m +
				" do ano de " + a);
		System.out.printf("%d/%d/%d", d1.data,d1.mes,d1.ano);
	}
	
	
}
