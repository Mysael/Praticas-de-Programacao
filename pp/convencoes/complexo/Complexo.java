package pp.convencoes.complexo;

// removi o "import java.util.Date;"

//adicionei cabeçalho javadoc
/**
 * classe Complexo que realizará operações com valores
 * @author Mysael
 * @version 0.01
 *
 */

public class complexo //coloquei o nome da classe com letra maiúscula na primeira letra
{
    private double real; //coloquei "real" no lugar de "real"
	private double imaginario;   

	/**
	 * controi um numero complexo. A parte real sera 0.0 e a parte
	 * imaginaria tambem sera 0.0.
	 */
    public complexo() 
    {	real = 0.0;
		imaginario = 0.0;
    }

	/**
	 * cria um numero complexo.
	 * @param i parte imaginaria do numero complexo.	
	 * @param r parte real do numero complexo.
	 */ //adicionei parametro para r
    
    public complexo(double r, double i) //coloquei e minúsculo a variável "I"
    { 	real = r;	
		imaginario = i;
    }  

	/**
	 * Soma um valor inteiro ao numero imaginario
	 * @param n valor inteiro a ser somado
	 */
    public void soma(int n)
    {	real += n;
		imaginario += n;
    }
	
	/**
	 * Soma um numero imaginario a este numero imaginario
	 * @param c numero imaginario a ser somado
	 */
    public void soma(complexo c) //coloquei o "C" para lowercase
    {	real += c.real;
		imaginario += c.imaginario;
    }
}