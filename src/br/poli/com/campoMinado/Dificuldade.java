package br.poli.com.campoMinado;

public enum Dificuldade {
	FACIL(9), DIFICIL(16);
	private final int valor;
	
	private Dificuldade (int k) {
		this.valor = k;	
	}
	
	public int getValor() {
		return this.valor;
	}
}
