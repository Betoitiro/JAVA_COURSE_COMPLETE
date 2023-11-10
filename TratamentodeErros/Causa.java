package TratamentodeErros;

public class Causa {

	
	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause()!=null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception cause) {
			throw new IllegalArgumentException(cause);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("O aluno esta duro!!");
		}
		
		System.out.println(aluno.nome);
	}
}
