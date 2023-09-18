package Steam_API.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio_FIlter_app {
    
    //usar o filter para dizer o nome do carro, se sua faxetaria de preço estar caro ou barato 
    //depos faça um  filter para a potencia do carro
    public static void main(String[] args) {
        
        Desafio_Filter_Carro c1 = new Desafio_Filter_Carro("Gol", 89000, 90);
        Desafio_Filter_Carro c2 = new Desafio_Filter_Carro("Onix", 95000, 93);
        Desafio_Filter_Carro c3 = new Desafio_Filter_Carro("Golf Tsi", 200000, 160);
        Desafio_Filter_Carro c4 = new Desafio_Filter_Carro("Polo Tsi", 135000, 116);
        Desafio_Filter_Carro c5 = new Desafio_Filter_Carro("jetta Gli", 269000, 231);
        Desafio_Filter_Carro c6 = new Desafio_Filter_Carro("Porsche boxster s", 645000, 350);

        List<Desafio_Filter_Carro> carro = Arrays.asList(c1, c2, c3, c4, c5, c6);

        /*
        Predicate<Desafio_Filter_Carro> precoN = a -> a.preco <200000 ||a.preco >80000;
        Function<Desafio_Filter_Carro, String> StatusN = 
            a -> a.name + " Esta na faixetaria monetaria de corro normal, com o preco de " + a.preco;

        carro.stream()
           .filter(precoN)
           .map(StatusN)
           .forEach(System.out::println);

        Predicate<Desafio_Filter_Carro> precoC = a -> a.preco>=200000;
        Function<Desafio_Filter_Carro,String> StatusCaro = 
            a-> "" + a.name + " esta na faixa de carros caros, com o preço de " + a.preco;

        carro.stream()
            .filter(precoC)
            .map(StatusCaro)
            .forEach(System.out::println);
        
        Predicate<Desafio_Filter_Carro> potenciaB = a -> a.potencia < 100;
        Function<Desafio_Filter_Carro,String> StatusB = 
        a -> a.name + " Possui " + a.potencia + " Cv de potencia";
        
        carro.stream()
            .filter(potenciaB)
            .map(StatusB)
            .forEach(System.out::println);
        */
        Predicate<Desafio_Filter_Carro> potenciaA =  a->a.potencia >150 || a.potencia<300;
        Function<Desafio_Filter_Carro,String> STatusA = 
        a -> a.name + " Possui " + a.potencia + "CV de pontencia, enquadrando na potencia media";

        carro.stream()
            .filter(potenciaA)
            .map(STatusA)
            .forEach(System.out::println);

        Predicate<Desafio_Filter_Carro> PotenciaC = a -> a.potencia>300;
        Function<Desafio_Filter_Carro, String> StatusC = 
        a -> a.name + " Possui " + a.potencia +"CV, sendo enquadrado como carro esportivo";
    }
}
