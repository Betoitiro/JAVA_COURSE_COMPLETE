package Steam_API.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
 
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        /*
            1 - Transformar o numero de String para binario;
            2- Inverter a String "110" => "011";
            3 - converter de volta para inteiro => "011" => 3;
        */ 

        UnaryOperator<String> inverter = //operador unario
            s -> new StringBuilder(s).reverse().toString(); //usando uma função lambda para reverter as Strings

        Function<String, Integer> binarioParaInt =
            s-> Integer.parseInt(s,2); 

        nums.stream()
            .map(Integer:: toBinaryString) //usando a função para mudar para binario
            .map(inverter) //inverter as Strings
            .map(binarioParaInt) //mudando de binario para String
            .forEach(System.out::println);
    }
}
