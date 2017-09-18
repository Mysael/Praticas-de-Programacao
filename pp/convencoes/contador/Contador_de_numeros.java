package pp.convencoes.contador;

//removi o "import java.util.Scanner;"

/**
 * Esta classe implementa um contador.
 */
public class Contador_de_numeros
{                                  
	private int NUM; 
	
	/**
	 * Incrementa o contador interno em um.
	 */
	public void Incrementar()
	{	NUM++;
	}   	
	
	public void Decrementar()
	{   NUM--;
	}  
	
	/**
	 * Reinicia o contador para determinado valor.
	 * @param Inicial novo valor inicial
	 */
	public void comecar(int Inicial) 
	{   NUM = Inicial;  
	}   
 } 