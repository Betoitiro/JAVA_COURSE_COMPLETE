package TratamentodeErros;

public class Basico {

	public static void main(String[] args) {		

		//try é usado para envolver o codigo em uma exceção que pode ocorrer
		try {
			double a = 7/0;
			System.out.println(a);
		}
		//é usado para capturar e tratar exeções especificas
		catch(Exception execeao) {
			System.out.println("Ocorreu um erro");
		}
		//É o bloco opcional que é usado para ser executado idependente da execção
		finally {
			System.out.println("Codigo final");
		}
		
		
		try {
			System.out.println(7/0);
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			//vai buscar uma mensagem e informar onde esta o erro
			System.out.println("Ocorreu o erro " + e.getMessage());
		}
	}
}
