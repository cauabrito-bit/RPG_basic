package classes;
import java.util.Scanner;
public class SalaRPG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Personagem deku = new Heroi("Deku");
		Personagem shigaraki = new Vilao("Shigaraki");
		System.out.println("VAMOS LUTAR, ESCOLHA SEU LADO:");
		System.out.println("=========HEROI=========");
		System.out.println("nome: "+ deku.getNome()+" || vida: "+deku.getVida());
		System.out.println("=========VILAO=========");
		System.out.println("nome: " + shigaraki.getNome()+ " || vida: " +shigaraki.getVida());
		System.out.println("=======================");
		System.out.println("Digite 1 para selecionar: " + deku.getNome() + " || OU || Digite 2 para selecionar: " + shigaraki.getNome());
		int resposta = scanner.nextInt();
		while(resposta != 1 && resposta !=2) {
			System.out.println("VALOR INVALIDO");
			System.out.println("Digite 1 para selecionar: " + deku.getNome() + " || OU || Digite 2 para selecionar: " + shigaraki.getNome());
			resposta = scanner.nextInt();
		}
		if (resposta==1) {
			System.out.println("OLA " + deku.getNome()+" SUA VIDA ATUAL E: "+ deku.getVida());
			System.out.println("MAS O "+ shigaraki.getNome() +" TE ATACOU PELAS COSTAS");
			int danoHero = shigaraki.atacar();
			deku.receberDano(danoHero, shigaraki.getNome());
			
			System.out.println("Digite 1 para atacar ou 2 para fugir: ");
			int decisao = scanner.nextInt();
			
			while(decisao != 1 && decisao !=2) {
				System.out.println("VALOR INVALIDO");
				System.out.println("Digite 1 para atacar ou 2 para fugir: ");
				
				decisao = scanner.nextInt();
			}
			
			if(decisao == 1) {
				System.out.println("O VILAOZINHO FOI ATACADO");
				int danoVilao = deku.atacar();
				shigaraki.receberDano(danoVilao, deku.getNome());
			} else {
				System.out.println("FIM DA BATALHA");
			}
		}
		if (resposta==2) {
			System.out.println("OLA " + shigaraki.getNome()+" SUA VIDA ATUAL E: "+ shigaraki.getVida());
			System.out.println("MAS O "+ deku.getNome() +" VEIO TE IMPEDIR");
			int danoVilao = deku.atacar();
			shigaraki.receberDano(danoVilao, deku.getNome());
			System.out.println("Digite 1 para atacar ou 2 para fugir: ");
			int decisao = scanner.nextInt();
			while(decisao != 1 && decisao !=2) {
				System.out.println("VALOR INVALIDO");
				System.out.println("Digite 1 para atacar ou 2 para fugir: ");
				decisao = scanner.nextInt();
			}
			if(decisao == 1) {
				System.out.println("O HEROIZINHO FOI ATACADO");
				int danoHero = shigaraki.atacar();
				deku.receberDano(danoHero, shigaraki.getNome());
			} else {
				System.out.println("FIM DA BATALHA");
			}
		}
		scanner.close();
	}

}
