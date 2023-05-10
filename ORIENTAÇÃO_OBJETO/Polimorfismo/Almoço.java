package ORIENTAÇÃO_OBJETO.Polimorfismo;

public class Almoço {
	
	public static void main(String[] args) {
		
		Pessoa Hercules = new Pessoa(99.50);
		
		Arroz alimento1 = new Arroz(0.350); //atribuindo o amimento a classe
		Feijao alimento2 = new Feijao(0.250);
		
		System.out.println(Hercules.getPeso());//verificando o peso da pessoa
		
		Hercules.comer(alimento1);//atriuindo o peso do alimento a Hercules
		Hercules.comer(alimento2);
		
		System.out.println( "Hercules esta pesando "+ Hercules.getPeso()+ "kg");// nesse caso o peso de hercules sera apresentado
		//com o acrescimo de 0.350 g e 0.250 g, dessa maneira ele ficara pesando 100.1 kg 
		
		
		
		
		Sorvete sobremesa = new Sorvete(0.500); //chamamos o metdo de sorvete
		
		Hercules.comer(sobremesa);
		
		System.out.println("Hercules apos comer a sobremersa ficou pensando " + Hercules.getPeso() + "kg");
		
	
	}

}
