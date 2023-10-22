package Lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorDesafio {

	public static void main(String[] args) {
		
		
		//usar a função lambda para dar um desconto de 5% ao produto
		//Imposto Municipal: >=2500(8,5)/ <2500 (insento)
		//Frete: >= 3000 (100) / <3000 (insento)
		//Arrendodar: Deixar duas casas decimais
		//Formatar para duas casas decimais 
		
        Function<Produto, Double> precoF =
                p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoM =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco;
        Function<Double, String> arredondar =
                preco -> String.format("%.2f", preco);

				
		Produto p = new Produto("iphone 15", 4100, 0.05);
		
		String precop = precoF
				.andThen(impostoM)
				.andThen(frete)
				.andThen(arredondar)
				.apply(p);
		System.out.println(precop);
		
	}
}
