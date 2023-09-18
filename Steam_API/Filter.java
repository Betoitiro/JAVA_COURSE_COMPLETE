package Steam_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    
/* 
    é a maneira que o sistema faz para filtrar uma lista ou ArrayList

    podendo usar uma condição para adicionar os elementos a uma nova lista

    [1,2,3,4,5,6,]
    usando um filtro para numero pares a lista ficaria
    [2,4,6]
    */

    public static void main(String[] args) {
        
        Filter_Aluno a1 = new Filter_Aluno("Ana", 7.8);
        Filter_Aluno a2 = new Filter_Aluno("Maria", 6.5);
        Filter_Aluno a3 = new Filter_Aluno("Pedro", 8.7);
        Filter_Aluno a4 = new Filter_Aluno("João", 7.5);
        Filter_Aluno a5 = new Filter_Aluno("Carlos", 8.7); 
        Filter_Aluno a6 = new Filter_Aluno("Joana", 8.7);

        List<Filter_Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);


        Predicate<Filter_Aluno> reprovado = a -> a.nota<7;
        Function<Filter_Aluno,String> reprvado = 
                a -> "Infelizmente " + a.nome + " Voce foi reprovado!";
        
        alunos.stream()
            .filter(reprovado)
            .map(reprvado)
            .forEach(System.out::println);
        //usando função lamda junto com filtro
        Predicate<Filter_Aluno> aprovado = a -> a.nota >=7;
        Function<Filter_Aluno, String> saudacaoAprovado = 
                a -> "Parabens " + a.nome + "! Voce foi aprovado!";

        alunos.stream()
            .filter(aprovado) //usando filtro
            .map(saudacaoAprovado)//usando função stream
            .forEach(System.out::println); //forEach para imprimir as mensagens

    }

}
