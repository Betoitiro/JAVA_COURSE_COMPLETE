package METODOS_CLASSES;

public class DESAFIO_METODO_DATA_TESTE {
	public static void main(String[] args) {
	
		DESAFIO_METODO_DATA d1 = new DESAFIO_METODO_DATA();
		d1.dia = 19;
		d1.mes = 12;
		d1.ano = 1980;
		
		var d2 = new DESAFIO_METODO_DATA();
		d2.dia =11;
		d2.mes = 10;
		d2.ano = 2000;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		d1.impdataFormatada();
		System.out.println();//para pular linha, se n d1 e d2 ficariam na mesma sentença
		d2.impdataFormatada();
	}
}
