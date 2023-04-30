package ORIENTAÇÃO_OBJETO.Desafio;

public class sistema {

	public static void main(String[] args) {
		
		cliente c1 = new cliente("julia maria");
		
		compra cp1 = new compra();
		cp1.addintem("caneta", 9.50, 100);
		cp1.addintem(new produto("notebook", 3000),2);
		
		compra cp2 = new compra();
		cp2.addintem("capa telefone", 10.50, 2);
		cp2.addintem(new produto("iphone 14", 4500), 3);
		
		compra cp3 = new compra();
		cp3.addintem("empressora",1500, 2);
		cp2.addintem(new produto("tablet", 3500),3);
		
		c1.compras.add(cp1);
		c1.compras.add(cp2);
		c1.compras.add(cp3);
		System.out.println("contabilidade do cliente " + c1.nome + ":");
		System.out.printf("O valor total da copra do/a cliente "+ c1.nome +" foi o total de R$" + c1.obterValortotal());
		
	}
}
