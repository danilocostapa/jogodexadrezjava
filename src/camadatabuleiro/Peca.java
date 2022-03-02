package camadatabuleiro;

public class Peca {

	/*atributos*/
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	/*construtor passando apenas o tabuleiro ao criar a pe�a - a posi��o inicial sera nula*/
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
