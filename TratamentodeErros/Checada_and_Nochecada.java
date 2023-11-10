package TratamentodeErros;

public class Checada_and_Nochecada {

	public static void main(String[] args) {
		
		//Chamando os metodos que foram criados para chamar os erros

		
		try {
			gerar01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("OCORREU UM ERROOOO");
		}
		
		
		try {
			gerar02();
		}catch(RuntimeException e) { //poderia colocar a execao gerica
			
			/*
			 * imprimir o tipo do erro
			 * e.printStackTrace();
			 * */
			
			//Imprimir mensagem de erro
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	
	
	//Execao declarada / verificada /check -> Tem que declarar no metodo
	static void gerar01() throws Exception {
		throw new Exception("Ocorreu um erro 001 ;)");

	}
	
	//Execao não checada / não verificada -> Não tem que declarar no metodo

	static void gerar02() {
		throw new RuntimeException("ocorreu um erro 002 ;)");

	}
	
}

