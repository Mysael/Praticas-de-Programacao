package pp.convencoes.bubblesort;

public class Bubble_Sort 
{	
	/**
	 * Ordena um array de inteiros utilizando o algoritmo classico do
	 * BubbleSort, que consiste em iterar sobre o array empurando os 
	 * maiores valores para o final.
	 * @return Vetor ordenado 
	 */
    public static void ordenar(int Vetor[]) 
	{   for (int i = Vetor.length; i >= 1; i--) 
		{	for (int J = 1; J < i; J++) 
			{	if (Vetor[J - 1] > Vetor[J]) 
				{	int AUX = Vetor[J];  
                    Vetor[J] = Vetor[J - 1];  
                    Vetor[J - 1] = AUX;  
                }  
            }  
        }  
    }  
} 