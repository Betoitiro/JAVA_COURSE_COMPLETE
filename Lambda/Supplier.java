package Lambda;

import java.util.Arrays;
import java.util.List;

public class Supplier {

	public static void main(String[] args) {
		
		java.util.function.Supplier<List<String>> Nomes = 
				() -> Arrays.asList("ana", "gui", "bia", "lia");
				
		System.out.println(Nomes.get());
	}
}
