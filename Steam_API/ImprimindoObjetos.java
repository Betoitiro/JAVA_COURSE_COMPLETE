package Steam_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    
    public static void main(String[] args) {
        List <String> aprovados = Arrays.asList("Lu", "Beto", "ana", "neto");
        List <String> reprovados = Arrays.asList("julia", "fê", "ygo", "jp");

        //usando for para representar todos os objetos da lista
        
        System.out.println("Alunos que foram aprovados!");
        for (int i =0; i <aprovados.size();i++){
            System.out.println(aprovados.get(i));
        }
        //usando foreach para apresentar todos os envolvidos da lista

        System.out.println("Alunos que foram reprovados!!");
        
        for (String nome : reprovados) {
            System.out.println(nome);
        }
        //usando iterator
        
        //iterator é uma interface do java que permite percorrer uma sequencia
        //de elementos, como no caso uma lista
        java.util.Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Stream abre mais oportunidade de funcionabilidades ao codigo de maneira mais simplificada
        System.out.println("\n \n usando stream para manipular dados");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out :: println); //laço interno (todo o algoritimo que ficariam apresentados no codigo
                            //ficarão implicitos na linguagem, ou seja a propria linguagem fara a opeção do algoritimoS)


    }
}
