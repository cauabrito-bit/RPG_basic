package classes;

import java.util.Random;

public class Heroi extends Personagem implements Lutador {

	public Heroi(String nome) {
		super(nome);
		this.vida += 5;
		
	}
	@Override
	public int atacar() {
		Random random = new Random();
		int bonus = random.nextInt(20)+1;
		int danoTotal = forca + bonus;
		return danoTotal;
	}

}
