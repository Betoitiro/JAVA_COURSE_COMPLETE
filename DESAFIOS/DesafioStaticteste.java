package DESAFIOS;

public class DesafioStaticteste {
	public static void main(String[] args) {
		
		DesafioStatic ds = new DesafioStatic("icer Nitro 5", 3,4800);
		
		System.out.println(ds.desconto());
		System.out.println("o produto escolhido foi " + ds.produto);
		System.out.println("esta custando R$" + ds.preco);
		System.out.println("com o desconto padrão da loja de 25%"
				+ " ficara por R$" + ds.desconto());
		
		System.out.println();
		
		var ds2 = new DesafioStatic();
		ds2.produto = "iphone 11";
		ds2.preco = 3800;
		ds2.setor = 3;
		
		System.out.println("o produto que voce escolheu foi " + ds2.produto);
		System.out.println("o preço do seu produto é " + ds2.preco);
		System.out.println("o preço com o desconto foi de R$" + ds2.desconto());
		
		System.out.println();
		System.out.println();
		
		System.out.println("valor com desconto do" + ds.produto + " R$" + ds.desconto());
		System.out.println("valor com desconto do " + ds2.produto + " R$" +ds2.desconto());
		
		System.out.println();
		System.out.println();
		
		double valortotal = ds.desconto() + ds2.desconto();
				
		System.out.println("o seu carrinho tem dois produtos " + ds.produto + " e " + ds2.produto +
				"o valor total ficara R$" + valortotal);
		
		
	}
}
