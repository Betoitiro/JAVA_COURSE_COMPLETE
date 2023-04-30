package ORIENTAÇÃO_OBJETO;

public class Alunoteste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Humberto");
		Aluno aluno2 = new Aluno ("Roberto");
		Aluno aluno3 = new Aluno ("Jorge");
		
		Curso curso1 = new Curso ("JAVA");
		Curso curso2 = new Curso ("PYTHON");
		Curso curso3 = new Curso ("JAVASCRIPT");
		
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		curso1.addAluno(aluno3);
		
		curso2.addAluno(aluno2);
		curso2.addAluno(aluno3);
		curso1.addAluno(aluno1);
		curso3.addAluno(aluno3);
		
		
		System.out.println("alunos matriculados no curso 1 (" + curso1.nome + ")");
		
		for(Aluno aluno :  curso1.alunos) {
			System.out.println("Estou matriculado no curso 1...");
			System.out.println("...E o meu nome é " + aluno.nome);
		}
		System.out.println();//quebra de linha
		System.out.println("alunos matriculados no curso 3 (" + curso3.nome + ")");
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso 3 ...");
			System.out.println("... meu nome é " + aluno.nome);
		}
		System.out.println();//quebra de linha
		System.out.println("alunos matriculados no curso 2 (" + curso2.nome + ")");
		for(Aluno aluno : curso2.alunos) {
			System.out.println("Estou matriculado no curso 2 ...");
			System.out.println("... y me lhamo " + aluno.nome);
		}
		
		//mostrar os nomes dos alunos, de acordo com o metodo da classe aluno
		//System.out.println(aluno1.cursos.get(0).alunos);
		
		
		//Metodo para encontrar os alunos que estão no curso
		//vai listalos
		Curso cursoencontrado = aluno3.obterCurso("Javascript");
		if(cursoencontrado != null) {
			System.out.println(cursoencontrado.nome);
			System.out.println(cursoencontrado.alunos);
		}
	}
}
