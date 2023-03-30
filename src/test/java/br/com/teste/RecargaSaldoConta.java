package br.com.teste;

import br.com.Conta;

public class RecargaSaldoConta {

	public Boolean recargaSaldoConta(Conta setsaldo, Integer valor) {
		setsaldo.setSaldo(valor);
		return true;

	}

}
