package camadatabuleiro;

public class Peca {

	/*atributos*/
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	/*construtor passando apenas o tabuleiro ao criar a peça - a posição inicial sera nula*/
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
