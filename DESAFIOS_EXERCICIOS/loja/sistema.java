package DESAFIOS_EXERCICIOS.loja;

public class sistema {
	
	public static void main(String[] args) {
		produto p1 = new produto();
		
		cliente cl = new cliente("João Carolos da Silva Andrade");
		produto pr = new produto();
		pr.nome = "som paionir";
		compra c1 = new compra();
		c1.additem("som paionir", 350, 1);
		c1.additem("altofalate",350 ,1);
		
		compra c2 = new compra();
		c2.additem("difusor",450, 2);
		c2.additem("cano de escape esportivo", 750, 2);
		
	
		
		cl.comp.add(c1); //junta as compras ao determinado cliente
		cl.comp.add(c2);
		
		//double descontof = cl.valtol() -(cl.valtol() * p1.descontof);
		double descontog = cl.valtol() - (cl.valtol() *p1.descontog);
		
		//System.out.println(cl.nome);
		
		System.out.println("Cliente: " + cl.nome);
		//System.out.println("O desconto do funcionario corresponde a 15%, ou seja, o valor da compra sera de R$" + descontof);
		System.out.println("Porem o gerente tem o desconto correspondente a 30%, assim, o valor da compra sera de R$" + descontog);
		
		produto p2 = new produto();
		cliente cl23 = new cliente("Herivaldo da Cunha Andrade");
		compra c21 = new compra();
		c21.additem("pelicula de carro full preta",400, 1);
		c21.additem("Para-choque",3500, 2);
		c21.additem("jogo de roda onix", 2500, 1);
		
		cl23.comp.add(c21);
		
		double descontof2 = cl23.valtol() - (cl23.valtol() * p2.descontof);
		System.out.println();//quebra de linha 
		
		System.out.println("Cliente: " + cl23.nome);
		System.out.println("O desconto que sera sedido para essa compra sera de 15%, o total da compra sera de R$" + descontof2);
		
	
	}
}
