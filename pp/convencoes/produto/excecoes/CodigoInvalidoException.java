package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lancada quando e fornecido um valor zerado ou negativo para a 
 * codigo de barras.
 */
public class CodigoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CodigoInvalidoException() {
		super("Código inválido");
	}
	
}
