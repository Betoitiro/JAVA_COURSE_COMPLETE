package Steam_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import ARRAYS.foreach;

public class Map {
    public static void main(String[] args) {
        

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");

        marcas.stream()
            .map(m ->m.toUpperCase())
            .forEach(System.out ::print);

        UnaryOperator<String> maiuscula = n -> 
            n.toUpperCase();
        
        UnaryOperator<String> primeiraLetra = n -> 
            n.charAt(0) + "";
        
        UnaryOperator<String> grito = n ->
             n + "!!!";


        System.out.println("\n\nUsando composição");

        marcas.stream()
            .map(maiuscula)
            .map(primeiraLetra)
            .map(grito)
            .forEach(System.out :: print);

        //Quebra de linha
        System.out.println("\n \n");
        Consumer<String> print = System.out::print; 
        
        List<String> modelos = Arrays.asList("Hatch", "Sedã ", "SUV", "Picapes");
    
        UnaryOperator<String> upper = n -> n.toUpperCase();
        UnaryOperator<String> quebraL = n -> n.toLowerCase() + (" \n");
        UnaryOperator<String> fistLetter = n -> n.charAt(0) + "";
        
        
         modelos.stream()
        		.map(fistLetter)
        		.map(quebraL)
        		.map(upper)
         		.forEach(print);
    }
}
