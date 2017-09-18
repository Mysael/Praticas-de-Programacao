package pp.convencoes.produto;

import pp.convencoes.produto.excecoes.*;

/**
 * Esta classe descreve um produto armazenado no estoque ou vendido. 
 * Objetos que implementam esta interface nao podem permitir 
 * a criacao de objetos com codigo de barras e descricao vazios ou nulos.  
 */
public class Produto 
{	private double quantidade;
	private String unidade;
	private long codigoDeBarras;
	private String descricao;
	private double preco;
	
	/**
	 * Altera a quantidade de produto no estoque.
	 * @param quantidade quantidade a ser adicionada
	 * @throws QuantidadeInvalidaException se a quantidade 
	 * 			fornecida for negativa ou zero
	 */ 
	public void adicionarQuantidade(double quantidade) 
			throws QuantidadeInvalidaException 
	{	if (quantidade <= 0) 
			throw new QuantidadeInvalidaException();
		this.quantidade += quantidade; 
	}

	/**
	 * Retorna o codigo de barras do produto. Este atributo 
	 * descreve a chave primaria para armazenamento de objetos
	 * deste tipo.
	 * @return codigo de barras do produto
	 */
	public long getCodigoDeBarras() 
	{	return codigoDeBarras;
	}

	/**
	 * Retorna a descricao do produto.
	 * @return descricao do produto
	 */
	public String getDescricao() 
	{	return descricao;
	}

	/**
	 * Retorna o preco do produto.
	 * @return preco do produto
	 */
	public double getPreco() 
	{	return preco;
	}

	/**
	 * Retorna a quantidade do produto no estoque.
	 * @return quantidade do produto no estoque
	 */
	public double getQuantidade() 
	{	return quantidade;
	}

	/**
	 * Remover a quantidade de produto no estoque.
	 * @param quantidade quantidade a ser removida
	 * @throws QuantidadeInvalidaException se a quantidade 
	 * 			fornecida for negativa ou zero
	 */
	public void removerQuantidade(double quantidade) throws QuantidadeInvalidaException
	{	if (quantidade <= 0) 
		{	throw new QuantidadeInvalidaException();
		}
		this.quantidade -= quantidade;
	}

	/**
	 * Altera o codigo de barras do produto. Este atributo 
	 * descreve a chave primaria para armazenamento de objetos 
	 * deste tipo.
	 * @param codigoDeBarras novo codigo de barras do produto
	 * @throws CodigoInvalidoException se for fornecido um valor 
	 * 			zerado ou negativo
	 */
	public void setCodigoDeBarras(long codigoDeBarras) 
						throws CodigoInvalidoException 
	{	if (codigoDeBarras <= 0) 
		{	throw new CodigoInvalidoException();
		}
		this.codigoDeBarras = codigoDeBarras;
	}

	/**
	 * Altera a descricao do produto.
	 * @param descricao nova descricao do produto
	 * @throws StringVaziaException se for fornecido 
	 * 			uma string vazia como parametro
	 */
	public void setDescricao(String descricao) 
				throws StringVaziaException 
	{	if (ehVazia(descricao)) 
		{	throw new StringVaziaException("descricao");
		}
		this.descricao = descricao;
	}

	/**
	 * Altera o preco do produto.
	 * @param preco novo preco do produto
	 * @throws PrecoInvalidoException se for fornecido valor 
     *         negativo, zero ou com mais de duas casas decimais
	 */
	public void setPreco(double preco) throws PrecoInvalidoException 
	{	String PrecoDouble = Double.toString(preco);
		int posPonto = PrecoDouble.indexOf(".");
		if (preco <= 0 
			|| PrecoDouble.length() - posPonto > 3) 
		{	throw new PrecoInvalidoException();
		}
		this.preco = preco;
	}

	/**
	 * Altera a unidade do produto. A unidade descreve 
	 * a forma como a quantidade do produto e medida 
	 * (ex: unidade, kilo, litro, metro,...)
	 * @param unidade nova unidade do produto
	 */
	public void setUnidade(String unidade) throws StringVaziaException
	{	if (ehVazia(unidade)) 
		{	throw new StringVaziaException("unidade");
		}
		this.unidade = unidade;
	} 
	
	/**
	 * Indica se palavra eh nula ou vazia.
	 * @return indica se palavra eh nula ou vazia
	 */
	private boolean ehVazia(String palavra) 
	{	return palavra == null || palavra.trim().isEmpty();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getUnidade() 
	{	return unidade;
	}
}
