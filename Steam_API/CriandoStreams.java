package Steam_API;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    
    public static void main(String[] args) {
        
        //Consumer interface que recebe um parametro que recebe um parametro e não retorna nada
        Consumer <String>print = System.out::print;
        Consumer <Object> print1= System.out :: print;

        //forma de criar uma Stream, é usando o Stream.of
        Stream<String> langs = Stream.of("Java ", " Pyhton", "  JS\n");
        langs.forEach(print);

        String [] maisLangs = {" Python ", " lisp ", " Perl ", "Go\n"};
        

        //seguna forma de criar uma stream
        Stream.of(maisLangs).forEach(print);

        //criando uma stream atreavez de um array
        Arrays.stream(maisLangs).forEach(print);
        
        //nessa Stream (maisLangs, 1, 2), o sistema vai impromir apenas o 1 elemento do array, assim ignorando o 2 elemento
        //ja nessa outra (maisLangs, 2,3), o sistem vai imprimir apenas o 2 elemento do array, assim ignorando o 3 elemento
        Arrays.stream(maisLangs, 1, 2).forEach(print);
        System.out.println();
        Arrays.stream(maisLangs, 2, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C", " PHP", " Kotlin", " JAVa");
        outrasLangs.stream().forEach(print);
        //usando o stream(). sera possivel acessar varias funcionalidades da linguagem
        outrasLangs.parallelStream().forEach(print); 
        //não vai apresentar mais da maneira como foi definida, e sim de maneia paralea

        //usando o generate, vai criar uma stream de maneira infinita
       // Stream.generate(() -> "a").forEach(print);

        //Stream.iterate(0 , n -> n+ 1 ).forEach(print1);
        //iterate, o sistema vai criar numeros de maneira sequencial e ficara somando +1 infinitamente

    }   

}
