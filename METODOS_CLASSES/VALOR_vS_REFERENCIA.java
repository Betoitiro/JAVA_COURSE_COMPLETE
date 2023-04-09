package METODOS_CLASSES;

public class VALOR_vS_REFERENCIA {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição valor, ja que trabalha com tipos primitivos
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		classe_data01 d1 = new classe_data01(1, 6, 2022);
		classe_data01 d2 = d1;//atribuição por referencia, ja que trabalha com objeto
		
		//ambas as alterações tanto em d1 quanto em d2, vao impactar a outra
		
		d1.data = 31;
		d2.mes = 10;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
