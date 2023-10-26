package Steam_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import Steam_API.Filter.Filter_Aluno;

public class Match {

	public static void main(String[] args) {
		
        Filter_Aluno a1 = new Filter_Aluno("Ana", 7.8);
        Filter_Aluno a2 = new Filter_Aluno("Maria", 7.5);
        Filter_Aluno a3 = new Filter_Aluno("Pedro", 7.7);
        Filter_Aluno a4 = new Filter_Aluno("João", 7.5);
        Filter_Aluno a5 = new Filter_Aluno("Carlos", 8.7); 
        Filter_Aluno a6 = new Filter_Aluno("Joana", 8.7);

        List<Filter_Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
		Predicate<Filter_Aluno> aprovado = a -> a.nota >=7;
		
		//para ve se todos os alunos deram como aprovados
		System.out.println(alunos.stream().allMatch(aprovado));
		//para ve se algum aluno foi aprovado
		System.out.println(alunos.stream().anyMatch(aprovado));
		//para ve se nenhum aluno foi aprovado, ou seja teve uma nota maior que 7
		System.out.println(alunos.stream().noneMatch(aprovado));
		//tendo a negação do predicado, que seria equivalente a ninguem ter tirado uma nota abaixo de 7
		System.out.println(alunos.stream().noneMatch(aprovado.negate()));
		
		Predicate<Filter_Aluno>reprovado = aprovado.negate();
		
		//caso nenhum aluno tenha sido reprovado o resultado sera true
		System.out.println(alunos.stream().noneMatch(reprovado));

	}
}
