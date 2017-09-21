package pp.convencoes.conta;

import java.util.Date;

/**
 * Classe que representará uma conta
 * 
 * @author Mysael
 * @version 0.05
 */ // adicionado cabeçalho javadoc

public class conta {
	private int numero;
	private Date dataDeAbertura; // "dataDeAbertura" para "dataDeAbertura"
	private double saldo;

	/**
	 * Cria uma conta bancaria com o numero e a data de abertura fornecidas.
	 * 
	 * @param numero
	 *            numero da conta
	 * @param dataDeAbertura
	 *            data de abertura da conta
	 */
	public conta(int numero, Date dataDeAbertura) {
		this.numero = numero;
		this.dataDeAbertura = dataDeAbertura;
		this.saldo = 0.0;
	}

	/**
	 * Deposita uma quantia na conta. A quantia deve ser maior que zero
	 * 
	 * @param quantia
	 *            quantia a ser depositada
	 * @return se o deposito foi realizado
	 */
	public boolean depositar(double quantia) {
		boolean realizada = false;
		if (quantia > 0) {
			this.saldo = this.saldo + quantia;
			realizada = true;
		}
		return realizada;
	}

	/**
	 * Saca uma quantia da conta. A quantia deve ser maior que zero e o saldo deve
	 * ser suficiente.
	 * 
	 * @param quantia
	 *            quantia a ser sacada
	 * @return se o saque foi realizado
	 */
	public boolean sacar(double quantia) {
		boolean realizada;
		if (0 < quantia && quantia <= this.saldo) {
			this.saldo = this.saldo - quantia;
			realizada = true;
		} else {
			realizada = false;
			return realizada;} //adicionado chaves na estrutura else
	}

	/**
	 * Transfere um valor desta conta para a conta destino fornecida. A quantia deve
	 * ser maior que zero e o saldo deve ser suficiente.
	 * 
	 * @param quantia
	 *            quantia a ser transferida
	 * @param destino
	 *            conta de destino do valor a ser transferido
	 * @return se a operação foi realizada com sucesso ou não
	 */ // adicionado "@return"
	public boolean tranferir(double quantia, conta destino) {
		boolean realizada = false;
		if (0 < quantia && quantia <= this.saldo) {
			this.saldo = this.saldo - quantia;
			destino.saldo = destino.saldo + quantia;
		}
		return realizada;
	}

	/**
	 * Retorna o numero da conta.
	 * 
	 * @return numero da conta
	 */
	public int getNumero() { //nome do método de "GetNumero" para "getNumero"
		return this.numero;
	}

	/**
	 * Retorna a data de abertura da conta.
	 * 
	 * @return data de abertura da conta
	 */
	public Date getdataDeAbertura() {
		return this.dataDeAbertura;
	}

	/**
	 * Retorna o saldo da conta.
	 * 
	 * @return saldo da conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
