package ORIENTAÇÃO_OBJETO.herança1;

public class Heroi extends jogador {

	boolean atacar(jogador oponente) {
	
		//essa maneira de usar o super, chama o comando da super class
		//assim, importa o comando atacar que tem em jogador pra essa classe
		//usando apenas os comandos abaixo, sem ter que refazer o codigo
		
	boolean ataque1 =  super.atacar(oponente);
	boolean ataque2 = super.atacar(oponente);
	return ataque1 | ataque2;
	}
	
	//outra maneira de fazer 
	/*
	 * 	boolean atacar(jogador oponente) {
		 int deltax = Math.abs(x- oponente.x);
		 int deltay = Math.abs(y-oponente.y);
		 
		 if(deltax ==0 && deltay ==1) {
			 oponente.life -= 15;
		 }else if(deltax ==1 && deltay ==0) {
			 oponente.life -=10;
		 }else {
			 return false;
		 }
		 
		 return true;
	}
	 * 
	 * 
	 */
}
