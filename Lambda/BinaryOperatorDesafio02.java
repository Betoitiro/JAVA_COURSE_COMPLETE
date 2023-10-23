package Lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorDesafio02 {

	public static void main(String[] args) {
		
		//usar a função lambda para dar um desconto de 5% ao produto
		//Imposto Municipal: >=2500(8,5)/ <2500 (insento)
		//Frete: >= 3000 (100) / <3000 (insento)
		//Arrendodar: Deixar duas casas decimais
		//Colocar informações do dispositivo 
		
		
		Produto p = new Produto("Drone hk9", 1950, 0.1);
		
		Function<Produto, Double> desc = 
				produto -> produto.preco *(1 - produto.desconto);
		UnaryOperator<Double> imposto =
				preco -> preco>=2500 ? preco*1.085 : preco;
		UnaryOperator<Double> frete =
				preco ->preco >=3000 ? preco +100 : preco;
		
		Function<Double, String> Arre =
				preco -> String.format("R$%.2f", preco);

				
		String precof = desc
				.andThen(imposto)
				.andThen(frete)
				.andThen(Arre)
				.apply(p);
		
		System.out.println("O "+ p.nome + " Custa: " + precof);
	}
}
