package br.com.caelum.contas;

import java.util.Collections;
import java.util.List; // Tem que importar a list da utils
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {// Polimorfismo ocorre aqui
			this.conta = new ContaCorrente(); 
		} else if (tipo.equals("Conta Poupança")) {// Polimorfismo ocorre aqui
			this.conta = new ContaPoupanca();
		}
		this.conta.setTitular(evento.getString("titular"));
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
	}

	public void deposita(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.deposita(valor);
	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"),destino);
	}
	
	public void ordenaLista(Evento evento) {
		List <Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
	}
}
