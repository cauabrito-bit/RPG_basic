package classes;

public class Personagem implements Lutador {
	protected String nome;
	protected int vida = 100;
	protected int forca = 15;
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public void receberDano(int dano, String atacante) {
		this.vida-=dano;
		
		if (vida <= 0) {
	        System.out.println( atacante + " e o fim! " + this.nome + " foi derrotado...");
	    } else {
	        System.out.println(atacante + " atacou " + this.nome + "! Dano: " + dano + " | Vida restante de " + this.nome + ": " + this.vida);
	    }
	}

	@Override
	public int atacar() {
		System.out.println("ATAQUE BASICO");
		return this.forca;
	}
	public String getNome() {
		return nome;
	}
	public int getVida() {
		return vida;
	}
}
