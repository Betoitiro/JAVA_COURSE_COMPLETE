package Lambda;

@FunctionalInterface //anotation
public interface Calculo {

	double executar(double a, double b); //metodo abstract 
	
	//uma interface funcional é classificada por possuir apenas um metodo
	
	//String teste(double c, double d);
	//se eu colocar outra função na hora de realizar os comandos do calculo 2, ira da erro, ja que vai ter duas funções e isso fara com que o sistema do java n funcione
	
	
	//colocando a @FunctionalInterface, representa uma função que faz com que a interface não receba mais metodo/função
	//ou seja, o sistema so recebera 1 metodo, caso seja colocado mais uma, sistema começara a dar erro e não ira funcionar
	
	
	
	//numa interface, se faz nexessario ter apenas uma classe abstrata, mas nenhum problema em ter classes default ou static
	
	//default String legal() { //codigo com default tem como por mais metodos
		//return "legal";}
	
	//static String muitoLegal() {
		//return "muito legal";
	//}
}
