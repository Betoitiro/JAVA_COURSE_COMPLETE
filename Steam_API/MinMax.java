package Steam_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import Steam_API.Filter.Filter_Aluno;

public class MinMax {

	public static void main(String[] args) {
		
        Filter_Aluno a1 = new Filter_Aluno("Ana", 7.8);
        Filter_Aluno a2 = new Filter_Aluno("Maria", 7.5);
        Filter_Aluno a3 = new Filter_Aluno("Pedro", 7.7);
        Filter_Aluno a4 = new Filter_Aluno("João", 7.5);
        Filter_Aluno a5 = new Filter_Aluno("Carlos", 8.7); 
        Filter_Aluno a6 = new Filter_Aluno("Joana", 8.7);

        List<Filter_Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
        Comparator<Filter_Aluno> melhorNota = (aluno1, aluno2) ->{
        	if(aluno1.nota > aluno2.nota) return 1;
        	if(aluno1.nota < aluno2.nota) return -1;
        	return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		
	}
}
