package pp.convencoes.removedor;

import java.util.StringTokenizer;

/**
 * Esta classe remove espacos superfluos no comeco, no meio e no final de uma frase. Ex: " testes" para "testes",
 * "testes " para "testes" e  " testando &nbsp;&nbsp; 1, 2 e 3 "
 * para "testando 1, 2 e 3".
 */
public class Removedor_de_Espacos 
{
	private String frase_original;
	
	public void setFrase(String frase) 
	{	this.frase_original = frase;
	}

	/**
	 * Retorna o atributo frase sem espacos superfluos.
	 */
	public String getFraseSemEspacosSuperfluos()
	{	StringBuilder builder = new StringBuilder();
		String frase = this.frase_original.trim();
		for (int I= 0; I < frase.length(); I++) 
		{	char letra = frase.charAt(I);
			if (letra == ' ')
			{	char letraAnterior = frase.charAt(I - 1);
				if (letraAnterior != ' ')
					builder.append(letra);
			} else
			{	builder.append(letra);	
			}
		}
		return builder.toString();
	}
}
