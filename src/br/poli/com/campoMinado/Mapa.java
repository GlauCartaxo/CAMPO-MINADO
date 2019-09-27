package br.poli.com.campoMinado;
import java.util.Random;

public class Mapa {
	private int[][] campo;
	private Dificuldade dificuldade;
	
	public Mapa(Dificuldade dificuldade){
		if(dificuldade.getValor() == 9) {
			this.campo = new int[9][9];
			inicializaCampo();
			imprimeTela();
			
		} else if(dificuldade.getValor() == 16) {
			this.campo = new int[16][16];
			inicializaCampo();
			imprimeTela();
		}
	}
	
	
	public int[][] getCampo() {
		return campo;
	}


	public void setCampo(int[][] campo) {
		this.campo = campo;
	}


	public Dificuldade getDificuldade() {
		return dificuldade;
	}


	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}


	public void inicializaCampo() {
		int bombas = 0;
		Random random = new Random();

		while (bombas < 10) {

			int coluna = random.nextInt(this.campo.length);
			int linha = random.nextInt(this.campo.length);

			if (this.campo[coluna][linha] != -1) {

				this.campo[coluna][linha] = -1;

				bombas++;

			}

		}

	}
	public void imprimeTela() {

		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {

				System.out.print(this.campo[i][j] + "  ");

			}

			System.out.println();

		}

	}
}
