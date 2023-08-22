package Lambda;

import java.util.function.Predicate;

public class Predicade {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> 
        prod.preco - (prod.preco * prod.desconto)/100 >= 1400;
        
        Produto produto = new Produto("Iphone 14", 4999.99, 15);
        System.out.println(isCaro.test(produto));
    }
}
