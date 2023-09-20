package Steam_API.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1 ,2 , 3, 4 , 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma =(ac,n) -> ac +n;

        /*/
        nums.stream()
            //reduce é uma função finalizadora, ou seja, ela fica no final
            .reduce(soma);
        */

        int total = nums.stream().reduce(soma).get();

        System.out.println("A soma dos valores da lista é " + total);
    }
}
