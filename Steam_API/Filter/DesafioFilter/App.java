package Steam_API.Filter.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Lapis",1.99,0.12 , 0);
        Produto p2 = new Produto("Notebook",5000,40 , 115);
        Produto p3 = new Produto("Caderno",15.99,0.1 , 40);
        Produto p4 = new Produto("Impressora",1500,0.1 , 120);
        Produto p5 = new Produto("Relogio",3500,35 , 30);
        Produto p6 = new Produto("Tv",2599,0.15 , 255);

        List<Produto> produtos =
            Arrays.asList(p1, p2, p3, p4, p5, p6);


        Predicate<Produto> grandeDesconto = 
            p -> p.desconto >=30;
        
        Predicate<Produto> FreteGratis = 
            p -> p.valorFrete ==0;

        Predicate<Produto> produtoRelevante = 
            p -> p.preco >=500;

        Predicate<Produto> freteCaro =
            p -> p.valorFrete >150;

        Function<Produto, String> chamadaPromocional = 
            p -> "Aproveite a promoção do nosso" +  p.nome +
            " por R$" +p.preco;

        produtos.stream()
            .filter(grandeDesconto)
            .filter(FreteGratis)
            .filter(produtoRelevante)
            .map(chamadaPromocional)
            .forEach(System.out::println); //dara o inicio ao processo das funções
    
    }
    
}
