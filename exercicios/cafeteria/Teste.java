package exercicios.cafeteria;

public class Teste {
	public static void main(String[] args) {
		Cafe nespresso, tresCoracoes;
		nespresso = new Cafe('F',true);
		tresCoracoes = new Cafe('f', true);
		
		CopoCafe copinho = new CopoCafe(200);
		copinho.encher(nespresso);
		
		copinho.esvazia(50);
		
		System.out.println(nespresso.getTipo());
		System.out.println(tresCoracoes.getTipo());
		
		System.out.println(copinho);
		System.out.println(copinho.toString());

	}
}
