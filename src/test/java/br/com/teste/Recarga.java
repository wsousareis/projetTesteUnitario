package br.com.teste;

import br.com.Cliente;
import br.com.Conta;

public class Recarga {

	public Boolean recargaSaldoConta(Cliente cliente, Integer valor) {
		RecargaSaldoConta recargaSaldoConta = new RecargaSaldoConta();
		Conta conta = cliente.getConta();
		recargaSaldoConta.recargaSaldoConta(conta, valor);
		return true;
	}

	public Boolean recargaSaldoTelefoneDA(Cliente cliente, Integer valor) {
		RecargaSaldoTelefone recargaSaldoTelefone = new RecargaSaldoTelefone();
		Integer saldoConta = cliente.getConta().getSaldo();
		if (saldoConta >= valor) {
			recargaSaldoTelefone.recargaSaldoTelefone(cliente.getTelefone(), valor);
			cliente.getConta().setSaldo(saldoConta - valor);
			return true;
		} else {
			return false;
		}
	}
}
