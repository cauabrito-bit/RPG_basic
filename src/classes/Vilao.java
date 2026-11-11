package classes;

import java.util.Random;

public class Vilao extends Personagem implements Lutador {
	
	public Vilao(String nome) {
		super(nome);
		this.vida += 15;
	}
	
	@Override
	public int atacar() {
		Random random = new Random();
		int bonus = random.nextInt(10)+1;
		int danoTotal = forca + bonus;
		return danoTotal;
	}

}
