package Steam_API.Reduce02;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import Steam_API.Filter.Filter_Aluno;

public class Reduce {
	
	public static void main(String[]args) {
		
        Filter_Aluno a1 = new Filter_Aluno("Ana", 7.8);
        Filter_Aluno a2 = new Filter_Aluno("Maria", 6.5);
        Filter_Aluno a3 = new Filter_Aluno("Pedro", 8.7);
        Filter_Aluno a4 = new Filter_Aluno("João", 7.5);
        Filter_Aluno a5 = new Filter_Aluno("Carlos", 8.7); 
        Filter_Aluno a6 = new Filter_Aluno("Joana", 8.7);

        List<Filter_Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
		Predicate<Filter_Aluno> aprovado = a -> a.nota >=7;
		Function<Filter_Aluno, Double> apenasNota = a -> a.nota;
		
		
		BiFunction<Media,Double, Media> calcularMedia = 
				(media,nota) -> media.add(nota);
				
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			//esse reduce faz necessario passar:
			//valor inicial
			//função aculmuladora
			//função que vai combinar as medias
			.reduce(new Media(), calcularMedia, combinarMedia);
		System.out.printf("A media do da turma é %.2f", media.getValor());

	}
}
