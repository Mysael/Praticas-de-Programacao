package pp.convencoes.formatador;

import java.sql.*;

/**
 * Classe que formata um identificador (atributo, metodo ou classe) de acordo com um padrão Camel Case.
 */
public class FormatadorCamelCase 
{	public static final String FORMATO_ATRIBUTO = "atributo";
	public static final String FORMATO_METODO = "metodo";
	public static final String FORMATO_CLASSE = "classe";
	public static final int primeiraPalavra = 0;
	
	private String identificador;
	
	/**
	 * Altera o identificador a ser formatado.
	 * @param IDENTIFICADOR identificador a ser formatado
	 */
	public void SetIdentificador(String IDENTIFICADOR)
	{	this.identificador = IDENTIFICADOR;
	}
	
	/**
	 * Retorna o identificador no formato Camel Case 
	 * para atributos (camelCase).
	 * @return identificador no formato camelCase
	 */
	public String getCamelCaseAtributo()
	{	return getCamelCase(false, this.identificador);
	}
	public String getCamelCaseMetodo()
	{	return getCamelCase(false, this.identificador);
	}
	
	/**
	 * Retorna o identificador no formato Camel Case 
	 * para classes (camelCase).
	 * @return identificador no formato CamelCase
	 */
	public String getCamelCaseClasse()
	{	return getCamelCase(true, this.identificador);
	}
	
	/**
	 * Retorna o identificador no formato Camel Case.
	 * @param PrimMaiuscula se desejar a primeira 
	 *			letra maiuscula
	 * @param identificador identificador a ser formatado
	 * @return identificador no formato Camel Case
	 */
	private String getCamelCase(boolean PrimMaiuscula, String identificador)
	{	String identMinusc = identificador.toLowerCase();
		String[] palavras = identMinusc.split(" ");
		String camelCase = "";
		for (int i = 0; i < palavras.length; i++)
		{	String primeiraLetra = palavras[i].substring(0, 1);
			if (primeiraPalavra < i || PrimMaiuscula)
				primeiraLetra = primeiraLetra.toUpperCase();
			String restoLetras = palavras[i].substring(1);
			camelCase = camelCase.concat(primeiraLetra);
			camelCase = camelCase.concat(restoLetras);
		}
		return camelCase;
	}
}
