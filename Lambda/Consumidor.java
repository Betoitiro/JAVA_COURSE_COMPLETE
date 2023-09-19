package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Consumidor {
    
    public static void main(String[] args) {
        
        //consumer é uma função que dara um retorno no terminal 
        Consumer<Produto> imprimir = 
            p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.89);
        imprimir.accept(p1);

        Produto p2 = new Produto("Gol", 89000, 9);
        Produto p3 = new Produto("Onix", 95000, 9);
        Produto p4 = new Produto("Golf Tsi", 200000, 16);
        Produto p5 = new Produto("Polo Tsi", 135000, 11);
        Produto p6 = new Produto("jetta Gli", 269000, 23);
        Produto p7 = new Produto("Porsche boxster s", 645000, 35);

        Consumer<Produto> Status = p 
            -> System.out.printf(p.nome + " esta custando R$" +  p.preco + "\n");


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        //o forEach ja recebe automaticamente o consumer
        produtos.forEach(Status); 

        /* 
        produtos.forEach(p -> System.out.printf("p.nome + " esta custando" +  p.preco + "\n""));
        */

    }
}
