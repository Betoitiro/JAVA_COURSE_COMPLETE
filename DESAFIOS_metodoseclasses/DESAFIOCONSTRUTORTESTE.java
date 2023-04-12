package DESAFIOS_metodoseclasses;

public class DESAFIOCONSTRUTORTESTE {
	 
	public static void main(String[] args) {

		//desafio que apareça uma data por padrão
		//e um que as datas sejam inseridas
		
		DESAFIOCONSTRUTOR c1 = new 	DESAFIOCONSTRUTOR ();
		
		//caso queira modificar um elemento, tipo ano e manter o resto como padrão é so:
		
		DESAFIOCONSTRUTOR c3 = new 	DESAFIOCONSTRUTOR();
		c3.ano = 2023;
		//nesse caso o unico elemento a ser alterado sera o ano
			
		
		
		var c2 = new DESAFIOCONSTRUTOR ();
		c2.dia = 31;
		c2.mes = 12;
		c2.ano = 1990;
		
		System.out.println(c1.DataFormat());
		System.out.println(c2.DataFormat());
	}
}
