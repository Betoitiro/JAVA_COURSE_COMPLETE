package OO;

import java.util.ArrayList;

public class compra {
	
	//um para muitos
	//um cliente para varios intens
	
	
	String cliente;
	ArrayList<intem> intens = new ArrayList<intem>();
	
	
	double valorT () {
		double total = 0;
		
		for(intem Item : intens) {
			total += Item.quantidade * Item.preco;
		}
		return  total;
	}
}
