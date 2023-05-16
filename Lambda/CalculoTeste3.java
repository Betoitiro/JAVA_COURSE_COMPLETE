package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//retirado do java.util.function
		
		//Não: int  -> Double (Double do tipo classe)
		//double -> Double
		//Usando o Double do tipo classe, tem que colocar os numeros 2.0, ou seja, colocar o . e o 0 se for o caso
		//os numeros tem que ser double
		
		
		BinaryOperator<Double> /*
		Poderia ter colocado Integer tambem no lugar do Double, sendo assim seria necessario que
		todos os valores fossem do tipo inteiro*/soma = (x, y) -> { //(x,y) ->{return x+y}; função de lambda
			return x + y;
		};
		
		System.out.println(soma.apply(5.0, 9.0));
		
		BinaryOperator<Double> multiplicar = (x , y) ->{double a =  x * y; return a;};//nesse caso, como possuimos o par de chaves, conseguimos colocar mais que uma sentença de codigo na mesma
																		//linha, sendo obrigatoriamente colocar o return no final.
		
		System.out.println(multiplicar.apply(5.0, 44.0)); 
	}
}
