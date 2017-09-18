package pp.convencoes.complexo;

// removi o "import java.util.Date;"

public class Complexo //Coloquei o nome da classe com letra maiúscula na primeira letra
{
    private double Real;
	private double imaginario;   

	/**
	 * Controi um numero complexo. A parte Real sera 0.0 e a parte
	 * imaginaria tambem sera 0.0.
	 */
    public complexo() 
    {	Real = 0.0;
		imaginario = 0.0;
    }

	/**
	 * Cria um numero complexo.
	 * @param I parte imaginaria do numero complexo		
	 */
    public complexo(double r, double I) 
    { 	Real = r;	
		imaginario = I;
    }  

	/**
	 * Soma um valor inteiro ao numero imaginario
	 * @param n valor inteiro a ser somado
	 */
    public void soma(int n)
    {	Real += n;
		imaginario += n;
    }
	
	/**
	 * Soma um numero imaginario a este numero imaginario
	 * @param C numero imaginario a ser somado
	 */
    public void soma(complexo C)
    {	Real += C.Real;
		imaginario += C.imaginario;
    }
}