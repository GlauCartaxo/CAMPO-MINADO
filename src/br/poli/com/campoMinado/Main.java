package br.poli.com.campoMinado;

public class Main {
	
	public static void main(String[] args) {
		
		Dificuldade d = Dificuldade.DIFICIL;
		
		Jogador j = new Jogador("Gabriel");
		
		Mapa m = new Mapa(d);
		
		CampoMinado c = new CampoMinado(j,m,d);
		
	

	}
}
