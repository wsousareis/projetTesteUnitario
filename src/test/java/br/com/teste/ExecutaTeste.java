package br.com.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.Cliente;
import br.com.Conta;
import br.com.Telefone;

public class ExecutaTeste {

	Cliente cliente;
	Conta conta;
	Telefone telefone;

	@Before
	public void init() {
		telefone = new Telefone("6199540660", 0);
		conta = new Conta(0);
		cliente = new Cliente("Wesley", telefone, conta);

	}

	@Test
	public void CT001() {
		Recarga rec = new Recarga();
		rec.recargaSaldoConta(cliente, 20);
		Assert.assertTrue("Valor da recarga é maior do que o saldo em conta", rec.recargaSaldoTelefoneDA(cliente, 20));
	}

	@Test
	public void CT002() {
		Recarga rec = new Recarga();
		rec.recargaSaldoConta(cliente, 20);
		Assert.assertFalse(rec.recargaSaldoTelefoneDA(cliente, 70));
	}

	@Test
	public void CT003() {
		RecargaSaldoConta recSaldConta = new RecargaSaldoConta();
		Assert.assertTrue("Depósito não efetuado", recSaldConta.recargaSaldoConta(conta, 8));
	}

	@Test
	public void CT004() {
		RecargaSaldoTelefone recSaldTelefone = new RecargaSaldoTelefone();
		Assert.assertTrue("Depósito não efetuado", recSaldTelefone.recargaSaldoTelefone(telefone, 8));
	}

}
