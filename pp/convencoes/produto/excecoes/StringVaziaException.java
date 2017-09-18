package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lançada quando uma string vazia ou nula e fornecida.
 */
public class StringVaziaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public StringVaziaException(String campo) {
		super("O campo " + campo + " não pode ser vazio");
	}
	
}


