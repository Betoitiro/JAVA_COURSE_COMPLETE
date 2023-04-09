package DESAFIOS;

public class DESAFIOCONSTRUTORTESTE {
	 
	public static void main(String[] args) {
		
		DESAFIOCONSTRUTOR c1 = new 	DESAFIOCONSTRUTOR ();
		
		var c2 = new DESAFIOCONSTRUTOR ();
		c2.dia = 31;
		c2.mes = 12;
		c2.ano = 1990;
		
		System.out.println(c1.DataFormat());
		System.out.println(c2.DataFormat());
	}
}
