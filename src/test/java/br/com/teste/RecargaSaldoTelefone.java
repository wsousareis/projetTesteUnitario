package br.com.teste;

import br.com.Telefone;

public class RecargaSaldoTelefone {

	public Boolean recargaSaldoTelefone(Telefone telefone, Integer valor) {
		telefone.setSaldo(telefone.getSaldo() + valor);
		return true;
	}
}
