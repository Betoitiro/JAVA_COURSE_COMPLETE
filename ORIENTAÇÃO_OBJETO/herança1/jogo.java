package ORIENTAÇÃO_OBJETO.herança1;

public class jogo {
	
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		heroi.y = 10;
		heroi.x = 10;
		heroi.life =100;	
		
		
		Monstro monstro = new Monstro();
		monstro.x=10;
		monstro.y =11;
		monstro.life = 100;
		
		//comandos de ataque	
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE); //o monstro saiu do angulo de ataqe do heroi
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		
		System.out.println();
		
		System.out.println("life monstro: " + monstro.life);
		System.out.println("life heroi: " + heroi.life);
	}

}
