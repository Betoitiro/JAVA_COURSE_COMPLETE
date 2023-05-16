package Lambda;

public class Calculoteste2 {

	public static void main(String[] args) {
		
		//lambda function
		
	
		Calculo soma = (x, y) -> { //(x,y) ->{return x+y}; função de lambda
			return x + y;
		};
		
		System.out.println(soma.executar(5, 9));
		
		Calculo multiplicar = (x , y) ->{double a =  x * y; return a;};//nesse caso, como possuimos o par de chaves, conseguimos colocar mais que uma sentença de codigo na mesma
																		//linha, sendo obrigatoriamente colocar o return no final.
		
		System.out.println(multiplicar.executar(5, 44));
		
		Calculo  dividir = (x, y) -> x*y; //quando não se usa o par de chaves o sistema do java percebe que vc so ira ter uma sequencia de codigo
		//essa maneira fica de forma mais otimizada no sistema, resumindo uma sentença de codigo, em apenas um trecho de codigo
		
		System.out.println(dividir.executar(69, 3));
		
		Calculo subtrair = (x , y) ->{
			return x - y;
		};
		
		System.out.println(subtrair.executar(925, 5478));
		
		
		
	}
}
