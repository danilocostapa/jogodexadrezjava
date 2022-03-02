package camadatabuleiro;

public class Posicao {

	/* Atributos */
	private int linha;
	private int coluna;

	/* Construtor */
	public Posicao(int linha, int coluna) {

		this.linha = linha;
		this.coluna = coluna;
	}

	/* get e set */
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	/* toString para imprimir a posição na tela */
	@Override
	public String toString() {
		return linha + ", " + coluna;
	}
}
