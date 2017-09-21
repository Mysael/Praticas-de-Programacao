package pp.convencoes.bubblesort;


//adicionado cabeçalho javadoc
//adicionado comentário
/**
 * Classe BubbleSorte para ordenação dos números
 * @author Mysael Ribeiro  
 * @version 0.01
 * 
 */

public class BubbleSort{ // Nome da classe antes estava "Bubble_Sort"

	/**
	 * Ordena um array de inteiros utilizando o algoritmo classico do BubbleSort,
	 * que consiste em iterar sobre o array empurando os maiores valores para o
	 * final.
	 * 
	 * @param int - tamanho do vetor
	 * @return vetor ordenado
	 */ //adicionado parametro no método
	
	public static void ordenar(int vetor[]) { //"vetor" para "vetor"
		for (int i = vetor.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) { //variavel "j" estava em maiusculo
				if (vetor[j - 1] > vetor[j]) {
					int aux = vetor[j]; //"AUX" para "aux"
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}
	}
}