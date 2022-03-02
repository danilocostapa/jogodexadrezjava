package camadatabuleiro;

public class Tabuleiro {

	/* atributos */
	private int linhas;
	private int colunas;
	private Peca[][] pecas; // matriz de peças

	/* Construtor recebendo apenas qtd de linhas e colunas */
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	/*gets e sets*/
	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

}
