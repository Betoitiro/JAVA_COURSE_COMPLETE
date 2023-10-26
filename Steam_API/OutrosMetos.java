package Steam_API;

import java.util.Arrays;
import java.util.List;

import Steam_API.Filter.Filter_Aluno;

public class OutrosMetos {

	public static void main(String[] args) {
		
        Filter_Aluno a0 = new Filter_Aluno("Ana", 8.7); 
        Filter_Aluno a1 = new Filter_Aluno("Ana", 8.7);        
        Filter_Aluno a2 = new Filter_Aluno("Maria", 6.5);
        Filter_Aluno a3 = new Filter_Aluno("Pedro", 8.7);
        Filter_Aluno a4 = new Filter_Aluno("João", 7.5);
        Filter_Aluno a5 = new Filter_Aluno("Ana", 8.7); 
        Filter_Aluno a6 = new Filter_Aluno("Joana", 8.7);
        Filter_Aluno a7 = new Filter_Aluno("Joseff", 8.7);
        Filter_Aluno a8 = new Filter_Aluno("clebson", 8.7);

        List<Filter_Aluno> alunos = Arrays.asList(a0,a1, a2, a3, a4, a5, a6,a7,a8);
		
        System.out.println("distintic"); //vai pegar os elementos distintos dentro da lista, ou seja,
        //ira iguinora os semelhantes
        //Quando um elemento possuir o mesmo nome e a mesma nota que o outro o script ira iguinoralo
        
        alunos.stream().distinct().forEach(System.out::println);
        
        System.out.println("\nSlip/limit");
        alunos.stream()
        .distinct()
        .skip(2)//para pular dois elementos
        .limit(2)//para limitar a capacidade de representaçã para apenas dois elementos
        .takeWhile(a-> a.nota >=7) //vai pegar todos os alunos que a nota for maior ou igual a 7
        .forEach(System.out::println);
        
	}
	
}
