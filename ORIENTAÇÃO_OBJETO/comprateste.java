package ORIENTAÇÃO_OBJETO;

public class comprateste {
	
	public static void main(String[] args) {
		
		//um para muitos
		//um cliente para varios intens
		
		compra compras = new compra();
		
		compras.cliente = "marcos";
		
		compras.intens.add(new intem ("canela", 20, 5.50));
		compras.intens.add(new intem ("capa celular", 1, 50));
		compras.intens.add(new intem ("pelicula", 2, 25));
		
		System.out.println(compras.intens.size()); //quantidade de compras
		System.out.println("O valor total das compras ficara R$" + compras.valorT());
		
		
	}
}
